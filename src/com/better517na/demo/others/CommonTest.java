/*
 * 文件名：CommonTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CommonTest.java
 * 修改人：duanji
 * 修改时间：2015年12月31日
 * 修改内容：新增
 */
package com.better517na.demo.others;

/**
 * 简单测试 static final 的变量被编译后会是什么样子.
 * 
 * @author duanji
 */
public class CommonTest {

    public static int a = 5 * 3;

    public static void print(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        print(String.valueOf(a));
    }

}
