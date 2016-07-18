/*
 * 文件名：ListAndArrayListTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ListAndArrayListTest.java
 * 修改人：duanji
 * 修改时间：2015年12月29日
 * 修改内容：新增
 */
package com.better517na.demo.commonclass;

import java.awt.Shape;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 测试List 和 ArrayList 的一些新功能.
 * 
 * @author duanji
 */
public class ListAndArrayListTest {

    @Test
    public void testForEach() {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(9);
        integers.add(26);

        // 测试使用Lambda表达式和集合内部迭代，来遍历一个集合
        integers.forEach(temp -> System.out.println(temp));

        List<Shape> shapes = new ArrayList<>();
        // shapes.stream().filter(s -> s.getColor() == BLUE);
        BigDecimal bigDecimal = new BigDecimal("0.01");
        System.out.println(bigDecimal);
    }

}
