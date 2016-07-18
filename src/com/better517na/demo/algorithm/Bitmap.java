/*

 * 文件名：Bitmap.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Bitmap.java
 * 修改人：duanji
 * 修改时间：2016年1月22日
 * 修改内容：新增
 */
package com.better517na.demo.algorithm;

import java.util.Random;

/**
 * 简单Bitmap.
 * 
 * @author duanji
 */
public class Bitmap {

    private byte[] bitMap = null;

    public static final int MAX = 10000000;

    public Bitmap(int size) {
        // 初始化时需要计算一共要使用多少个Byte。
        if (size % 8 == 0) {
            bitMap = new byte[size / 8];
        } else {
            bitMap = new byte[size / 8 + 1];
        }
    }

    public static void main(String[] args) {
        // Bitmap map = new Bitmap(10);
        // map.setTag(1);
        // map.setTag(5);
        // map.setTag(4);
        // map.setTag(2);
        //
        // map.setTag(11);
        // map.printBitMap();

        Bitmap map = new Bitmap(MAX);

        int[] ints = new int[5000000];

        Random random = new Random();
        for (int i = 0; i < 5000000; i++) {
            ints[i] = random.nextInt(MAX);
        }

        for (int i = 0; i < 5000000; i++) {
            // map.setTag(ints[i]);
            System.out.println(ints[i]);
        }

        map.printBitMap();

    }

    // 把一个数位设置为1
    public void setTag(int number) {
        int index = 0;
        int bit_index = 0;
        if (number % 8 == 0) {
            index = number / 8 - 1;
            bit_index = 8;
        } else {
            index = number / 8;
            bit_index = number % 8;
        }
        switch (bit_index) {
            case 1:
                bitMap[index] = (byte) (bitMap[index] | 0x01);
                break;
            case 2:
                bitMap[index] = (byte) (bitMap[index] | 0x02);
                break;
            case 3:
                bitMap[index] = (byte) (bitMap[index] | 0x04);
                break;
            case 4:
                bitMap[index] = (byte) (bitMap[index] | 0x08);
                break;
            case 5:
                bitMap[index] = (byte) (bitMap[index] | 0x10);
                break;
            case 6:
                bitMap[index] = (byte) (bitMap[index] | 0x20);
                break;
            case 7:
                bitMap[index] = (byte) (bitMap[index] | 0x40);
                break;
            case 8:
                bitMap[index] = (byte) (bitMap[index] | 0x8);
                break;
        }

    }

    // 打印bit为1 的数值
    public void printBitMap() {
        int size = bitMap.length;
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            byte temp = bitMap[i];

            if ((bitMap[i] & 0x01) == 1) {
                System.out.print(i * 8 + 1 + " ");
            }
            if ((bitMap[i] >> 1 & 0x01) == 1) {
                System.out.print(i * 8 + 2 + " ");
            }
            if ((bitMap[i] >> 2 & 0x01) == 1) {
                System.out.print(i * 8 + 3 + " ");
            }
            if ((bitMap[i] >> 3 & 0x01) == 1) {
                System.out.print(i * 8 + 4 + " ");
            }

            if ((bitMap[i] >> 4 & 0x01) == 1) {
                System.out.print(i * 8 + 5 + " ");
            }
            if ((bitMap[i] >> 5 & 0x01) == 1) {
                System.out.print(i * 8 + 6 + " ");
            }
            if ((bitMap[i] >> 6 & 0x01) == 1) {
                System.out.print(i * 8 + 7 + " ");
            }
            if ((bitMap[i] >> 7 & 0x01) == 1) {
                System.out.print(i * 8 + 8 + " ");
            }
        }
        System.out.println();
    }

    /**
     * 用来处理双位数.
     * 
     * @param number
     */
    public void setTag2(int number) {
        int index = 0;
        int bit_index = 0;
        if (number % 4 == 0) {
            index = number / 4 - 1;
            bit_index = 4;
        } else {
            index = number / 4;
            bit_index = number % 4;
        }
        switch (bit_index) {
            case 1:
                int temp = bitMap[index] >> 2;
                bitMap[index] = (byte) (bitMap[index] | 0x01);
                break;
            case 2:
                bitMap[index] = (byte) (bitMap[index] | 0x02);
                break;
            case 3:
                bitMap[index] = (byte) (bitMap[index] | 0x04);
                break;
            case 4:
                bitMap[index] = (byte) (bitMap[index] | 0x08);
                break;
        }
    }

    public void deal(int temp) {

    }

}