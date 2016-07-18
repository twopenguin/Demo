/*
 * 文件名：DirectSelectSort.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： DirectSelectSort.java
 * 修改人：duanji
 * 修改时间：2016年2月16日
 * 修改内容：新增
 */
package com.better517na.demo.algorithm.sort;

/**
 * 直接选择排序的静态实现和测试.
 * 
 * @author duanji
 */
public class DirectSelectSort {

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 49, 13, 27, 49, 78, 34, 12, 64, 1, 8};
        directSelectSort(a);
        show(a);
    }

    public static void directSelectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void show(int[] arr) {
        System.out.println("number:" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
