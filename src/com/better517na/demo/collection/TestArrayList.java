/*
 * 文件名：TestArrayList.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestArrayList.java
 * 修改人：duanji
 * 修改时间：2016年1月5日
 * 修改内容：新增
 */
package com.better517na.demo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * 测试JDK中ArrayList是如何实现一些功能的.
 * 
 * @author duanji
 */
public class TestArrayList {

    public static void main(String[] args) {
        testHashMap();
    }

    /**
     * 测试ArrayList 当容量不足时以什么机制增加.
     */
    public static void testArrayListHowToGrow() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            integers.add(i);
        }
        for (int i = 0; i < 24; i++) {
            integers.get(i);
        }
        System.out.println(integers.size());
    }

    public static void testLinkedListHowToGrow() {
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 24; i++) {
            integers.add(i);
        }
        for (int i = 0; i < 24; i++) {
            integers.get(i);
        }
        System.out.println(integers.size());
    }

    public static void testHashSet() {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 24; i++) {
            integers.add(i);
        }
    }

    public static void testHashMap() {
        HashMap<Integer, Object> integerMaps = new HashMap<>();
        for (int i = 0; i < 24; i++) {
            integerMaps.put(i, "" + i);
        }
    }

}
