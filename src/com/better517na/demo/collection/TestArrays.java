/*
 * �ļ�����TestArrays.java
 * ��Ȩ��Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * ������ TestArrays.java
 * �޸��ˣ�duanji
 * �޸�ʱ�䣺2016��2��22��
 * �޸����ݣ�����
 */
package com.better517na.demo.collection;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * ����Arrays ����������ʹ��.
 * 
 * @author duanji
 */
public class TestArrays {

    /**
     * public static <T> List<T> asList(T... a) { return new ArrayList<>(a); }.
     * 
     */
    @Test
    public void test0() {
        int[] a = {1, 2};
        double[] b = {1.1d, 2.3d};
        String[] c = {"a", "b"};
        List<Object> d = Arrays.asList(a, b, c);
        // 传入的参数是集合，则一个集合被当成一个元素
        // Assert.assertEquals(6, d.size());
        // size = 3

        // һ�㳣�õ��÷������£�
        List<String> strings = Arrays.asList("ad", "asdfas");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void test1() {
        int[] array = new int[5];
        // 填充数组
        Arrays.fill(array, 5);
        System.out.println(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

}
