/*
 * 文件名：CollectionsDemo.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CollectionsDemo.java
 * 修改人：duanji
 * 修改时间：2015年12月24日
 * 修改内容：新增
 */
package com.better517na.demo.commonclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Collections use.
 * 
 * @author duanji
 */
public class CollectionsDemo {

    List<Integer> integers;

    List<Book> books;

    @Test
    public void testReverse() {
        // ①使用 reverse 反转 List
        // public static void reverse(List<?> list) {
        Collections.reverse(integers);
        System.out.println(1 + ":" + integers); // [8, 6, 4, 2]
    }

    @Test
    public void testSort() {
        // ②使用 sort 来对 List 排序
        // public static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(integers);
        System.out.println(2 + ":" + integers);// [2, 4, 6, 8]
    }

    @Before
    public void init() {
        integers = new ArrayList<Integer>();
        integers.add(2);
        integers.add(4);
        integers.add(6);
        integers.add(8);

        books = new ArrayList<Book>();

    }

}
