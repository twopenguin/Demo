/*
 * 文件名：TestCycleBarrier.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestCycleBarrier.java
 * 修改人：duanji
 * 修改时间：2016年3月1日
 * 修改内容：新增
 */
package com.better517na.demo.thread.commonclass;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

/**
 * 测试CycleBarrier.
 * 
 * @author duanji
 */
public class TestCycleBarrier {

    public static class ComponentThread implements Runnable {
        CyclicBarrier barrier;// 计数器

        int ID; // 组件标识

        int[] array; // 数据数组

        // 构造方法
        public ComponentThread(CyclicBarrier barrier, int[] array, int ID) {
            this.barrier = barrier;
            this.ID = ID;
            this.array = array;
        }

        public void run() {
            try {
                array[ID] = new Random().nextInt(100);
                System.out.println("Component " + ID + " generates: " + array[ID]);
                // 在这里等待Barrier处
                System.out.println("Component " + ID + " sleep");
                System.out.println(barrier.getNumberWaiting() + "->" + barrier.getParties());
                barrier.await();
                System.out.println("hou" + barrier.getNumberWaiting() + "->" + barrier.getParties());
                System.out.println("Component " + ID + " awaked");
                // 计算数据数组中的当前值和后续值
                int result = array[ID] + array[ID + 1];
                System.out.println("Component " + ID + " result: " + result);
            } catch (Exception ex) {
            }
        }
    }

    /** */
    /**
     * 测试CyclicBarrier的用法
     */
    public static void testCyclicBarrier() {
        final int[] array = new int[40];
        CyclicBarrier barrier = new CyclicBarrier(20, new Runnable() {
            // 在所有线程都到达Barrier时执行
            public void run() {
                System.out.println("testCyclicBarrier run");
                array[2] = array[0] + array[1];
                System.out.println(array[2]);
            }
        });

        // 启动线程
        for (int i = 0; i < 20; i++) {
            new Thread(new ComponentThread(barrier, array, i)).start();
        }
    }

    public static void main(String[] args) {
        TestCycleBarrier.testCyclicBarrier();
    }

}
