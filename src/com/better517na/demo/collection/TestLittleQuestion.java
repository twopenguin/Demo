/*
 * 文件名：TestLittleQuestion.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestLittleQuestion.java
 * 修改人：duanji
 * 修改时间：2016年2月25日
 * 修改内容：新增
 */
package com.better517na.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class TestLittleQuestion {

    @Test
    public void testFor() {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");
        strings.add("h");
        strings.add("i");
        strings.add("j");
        Iterator<String> iterator = strings.iterator();
        // for (int i = 0; i < strings.size(); i++) {
        // System.out.println(strings.get(i));
        // strings.remove(strings.size() - 1);
        // }
        // for (int i = 0; iterator.hasNext(); i++) {
        // System.out.println(strings.get(i));
        // // strings.remove(strings.size() - 1);
        // iterator.remove();
        // }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println(strings);
        }
    }

    @Test
    public void testConcurrentMap() {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

    }

}
