/*
 * 文件名：BitmapTest.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： BitmapTest.java
 * 修改人：duanji
 * 修改时间：2016年1月22日
 * 修改内容：新增
 */
package com.better517na.demo.algorithm;

import java.util.Random;

import org.junit.Test;

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
public class BitmapTest {

    @Test
    public void test1() {
        Bitmap map = new Bitmap(Bitmap.MAX);

        int[] ints = new int[5000000];

        Random random = new Random();
        for (int i = 0; i < 5000000; i++) {
            ints[i] = random.nextInt(Bitmap.MAX);
        }

        for (int i = 0; i < 5000000; i++) {
            System.out.println(ints[i]);
        }
    }

    @Test
    public void test2() {
        Bitmap map = new Bitmap(Bitmap.MAX);

        int[] ints = new int[5000000];

        Random random = new Random();
        for (int i = 0; i < 5000000; i++) {
            ints[i] = random.nextInt(Bitmap.MAX);
            map.setTag(ints[i]);
        }
    }

}
