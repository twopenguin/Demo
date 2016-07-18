/*
 * 文件名：Main.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Main.java
 * 修改人：duanji
 * 修改时间：2016年5月23日
 * 修改内容：新增
 */
package com.better517na.demo.thread.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * 
 * <pre>
 * </pre>
 * 
 * @author duanji
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        Thread thread = new Thread(new Monitor(executorService));
        thread.start();
        for (int i = 0; i < 40; i++) {
            Task task = new Task(i, executorService);
            executorService.submit(task);
        }
    }

    public static class Task implements Runnable {

        private int key;

        private ExecutorService service;

        public Task(int key, ExecutorService service) {
            this.key = key;
            this.service = service;
        }

        @Override
        public void run() {
            System.out.println("key:" + key);
            System.out.println(((ThreadPoolExecutor) service).getActiveCount());
            try {
                Thread.sleep(key * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Monitor implements Runnable {

        ExecutorService executorService;

        private int number = 1;

        public Monitor(ExecutorService service) {
            this.executorService = service;
        }

        @Override
        public void run() {
            while (number > 0) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("activeThread:" + ((ThreadPoolExecutor) executorService).getActiveCount());

                if (((ThreadPoolExecutor) executorService).getActiveCount() == 0) {
                    executorService.shutdown();
                    number = 0;
                } else {

                }
            }
        }
    }

}
