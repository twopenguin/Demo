/*
 * 文件名：SingleTest.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： SingleTest.java
 * 修改人：duanji
 * 修改时间：2016年2月16日
 * 修改内容：新增
 */
package com.better517na.demo.javagrammar;

/**
 * 静态方法引用非静态变量.
 * 
 * @author duanji
 */
public class SingleTest {

    long[] a = new long[10];

    public static void main(String[] args) {
        // System.out.println(a[6]);
        // 这儿是静态方法引用非静态变量报错的问题
    }

}
