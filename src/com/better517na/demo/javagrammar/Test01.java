/*
 * 文件名：Test01.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Test01.java
 * 修改人：duanji
 * 修改时间：2016年1月10日
 * 修改内容：新增
 */
package com.better517na.demo.javagrammar;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class Test01 {

    /**
     * 测试 是否String 只能 加.
     */
    @Test
    public void test0() {
        String s1 = new String("Hello");
        String s2 = new String("there");
        String s3 = new String();
        s3 = s1 + s2;
        System.out.println(s3);
        // s3 = s1 - s2; 错误
        // s3 = s1 & s2; 错误
        // s3 = s1 && s2; 错误

        // String 只能加
    }

    /**
     * 测试哪些方法可以用来创建二维数组.
     */
    @Test
    public void test1() {
        float[] f[] = new float[6][6];
        // float f1[][] = new float[][6]; 错误
        // 原因为：Cannot specify an array dimension after an empty dimension
        float[][] f2 = new float[6][6];
        float[][] f3 = new float[6][];

        // 除了被注释的那种，其他的都是可以的
    }

    /**
     * 代码片段测试 if (m = false).
     */
    @Test
    public void test2() {
        boolean m = true;
        if (m = false)
            System.out.println("False");
        else
            System.out.println("True");

        // True
        // if(m=false)这边其实就相当于先给m赋值false，然后if(m)，这时候m为false，进入else
    }

    /**
     * 测试 Class<T> clazz 形参是否可以接受所有的 Class.
     * 
     * @throws Exception
     */
    @Test
    public void test3() throws Exception {
        class User {
            private int name;

            public int getName() {
                return name;
            }

            public void setName(int name) {
                this.name = name;
            }
        }

        class Member {
            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            private int id;
        }

        System.out.println(get(Member.class));
        System.out.println(get(User.class));

        // 测试结果，是可以的
    }

    /**
     * test3 测试用例的辅助方法.
     * 
     * @param clazz
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> clazz) throws Exception {
        System.out.println(clazz.getName());
        // return (T) Class.forName(clazz.getName()).newInstance();
        return null;
    }

    /**
     * 测试泛型对应的Class在内存中是否为同一个.
     * 
     */
    @Test
    public void test4() {
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        System.out.println(integers.getClass() == strings.getClass());
        // 测试结果：true
    }

    /**
     * 测试String类型的变量未初始化会怎么样.
     * 
     */
    @Test
    public void test5() {
        String s;
        // System.out.println("s=" + s);
        // 会报未初始化错误
    }

    /**
     * 测试finally里面的内容如果在前面被return是否还会被执行.
     * 
     */
    @Test
    public void test6() {
        try {
            return;
        } finally {
            System.out.println("Finally");
        }
        // finally 里面的内容总会被执行
        // 可以跟catch和finally，可以两个都写或只跟一个，但不能只写try{}
    }

    /**
     * 测试 i++ 问题.
     * 
     */
    @Test
    public void test7() {
        int i = 1;
        int j;
        j = i++;
        System.out.println(i + ":" + j);
        // 2:1
    }

    /**
     * 测试数组是否可以不用初始化，但是单个变量要初始化.
     * 
     */
    @Test
    public void test8() {
        long b;
        long a[] = new long[10];
        System.out.println(a[6]);
        // System.out.println(b);
        // 数组可以不用初始化
    }

    /**
     * 测试字符串能不能跟boolean比较.
     * 
     */
    @Test
    public void test9() {
        String a = "1";
        boolean b = true;
        // String 和 boolean 类型不能放在一起比较
        // if (a == b) {
        // System.out.println(" so true");
        // }
    }

}
