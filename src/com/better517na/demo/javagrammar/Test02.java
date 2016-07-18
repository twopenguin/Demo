/*
 * 文件名：Test02.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Test02.java
 * 修改人：duanji
 * 修改时间：2016年2月26日
 * 修改内容：新增
 */
package com.better517na.demo.javagrammar;

import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class Test02 {

    @Test
    public void test0() {
        int x = 5;
        switch (x) {
            case 5:
                x++;
                System.out.println(x);
                //$FALL-THROUGH$
            case 2 + 4:
                System.out.println(x);
                //$FALL-THROUGH$
            default:
                x += 2;
                System.out.println(x);
        }
    }

    @Test
    public void test1() {
        System.out.println(1 / 2); // 0
        System.out.println(-1 / 2); // 0
        System.out.println(-3 / 2); // -1
        System.out.println(-125 % 3); // -2
        System.out.println(-6 / 10);
    }

    @Test
    public void test2() {
        System.out.println(-7 % 3);
        System.out.println(7 % -3);
    }

    @Test
    public void test3() {
        char a = 'c';
        switch (a) {
            case 'a':
                System.out.println("a");
                //$FALL-THROUGH$
            case 'b':
                System.out.println("b");
                //$FALL-THROUGH$
            case 'c':
                System.out.println("c");
                //$FALL-THROUGH$
            case 'd':
                System.out.println("d");
                //$FALL-THROUGH$
            default:
                System.out.println("Error!");
        }
        // c d Error!
    }

    /**
     * $ | 等转义字符要加 \\.
     * 
     */
    @Test
    public void test4() {
        String a = "场建设费 $50.00";
        String b = a.replaceAll("\\$", "");
        System.out.println(b);
    }

}
