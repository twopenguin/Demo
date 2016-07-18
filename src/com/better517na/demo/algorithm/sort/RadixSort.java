/*
 * 文件名：RadixSort.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： RadixSort.java
 * 修改人：duanji
 * 修改时间：2016年3月1日
 * 修改内容：新增
 */
package com.better517na.demo.algorithm.sort;

/**
 * 基数排序. TODO
 * 
 * @author duanji
 */
public class RadixSort {

    // public static void main(String[] args) {
    // int[] data5 = new int[]{49, 38, 65, 97, 76, -49, 13, 27, 49, 78, 34, 12, 64, 1, 8};
    // data5 = new int[]{25};
    // data5 = new int[]{25, 12};
    // data5 = new int[]{};
    // }

    public static void sort(int[] number, int d) {
        int k = 0;
        int n = 1;
        int m = 1;

        int[][] temp = new int[10][number.length];
        int[] order = new int[10];

        while (m <= d) {
            for (int i = 0; i < number.length; i++) {
                int lsd = ((number[i] / n) % 10);
                temp[lsd][order[lsd]] = number[i];
                order[lsd]++;
            }
            for (int i = 0; i < 10; i++) {
                if (order[i] != 0)
                    for (int j = 0; j < order[i]; j++) {
                        number[k] = temp[i][j];
                        k++;
                    }
                order[i] = 0;
            }

            n *= 10;
            k = 0;
            m++;
        }
    }

    public static void main(String[] args) {
        int n, h;
        // System.out.print("输入你要进行排序的数的个数:");
        // Scanner A = new Scanner(System.in);
        // n = A.nextInt();
        // int[] array = new int[n];
        // System.out.print("请输入这" + n + "个数：");
        // Scanner B = new Scanner(System.in);
        // for (int i = 0; i < array.length; i++) {
        // array[i] = B.nextInt();
        // }
        // System.out.print("请输入这个" + n + "数中位数最多的那个数的位数：");
        // Scanner C = new Scanner(System.in);
        // h = C.nextInt();
        int[] array = new int[]{49, 38, 65, 97, 76, -49, 13, 27, 49, 78, 34, 12, 64, 1, 8, 12025};
        RadixSort.sort(array, 5);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void radixSort1(int[] array) {

        // 首先确定排序的趟数;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int time = 0;
        // 判断位数;
        while (max > 0) {
            max /= 10;
            time++;
        }

        // 建立10个队列;
        // LinkQueue<Integer>[] queue = new LinkQueue[10];
        // for (int i = 0; i < 10; i++) {
        // queue[i] = new LinkQueue<Integer>();
        // }

        // 进行time次分配和收集;
        // for (int i = 0; i < time; i++) {
        //
        // // 分配数组元素;
        // for (int j = 0; j < array.length; j++) {
        // // 得到数字的第time+1位数;
        // queue[array[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i)].enQueue(array[j]);
        // }
        // int count = 0;// 元素计数器;
        // // 收集队列元素;
        // for (int k = 0; k < 10; k++) {
        // while (queue[k].size() > 0) {
        // array[count] = (Integer) queue[k].deQueue().getElement();
        // count++;
        // }
        // }
        // }

    }

    public static void radixSort(int[] arr) {
        int maxBit = sureMaxBit(arr);
    }

    public static int numberOfBit(int a, int bit) {
        return 0;
    }

    /**
     * 确定一组数列中，最大值的最高位是什么位.
     * 
     * @return
     */
    public static int sureMaxBit(int[] arr) {
        int max = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
            }
        }
        int key = 0;
        do {
            key++;
            max /= 10;
        } while (max != 0);
        return key;
    }

    private static class Node<E> {
        E item;

        Node<E> next;

        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

}
