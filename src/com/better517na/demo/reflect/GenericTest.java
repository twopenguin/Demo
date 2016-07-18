/*
 * 文件名：GenericTest.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： GenericTest.java
 * 修改人：duanji
 * 修改时间：2016年1月20日
 * 修改内容：新增
 */
package com.better517na.demo.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class GenericTest {

    private Map<String, Integer> score;

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        Class<GenericTest> clazz = GenericTest.class;

        Field f = clazz.getDeclaredField("score");
        Class<?> c = f.getType();
        System.out.println(c);
        Type gType = f.getGenericType();
        if (gType instanceof ParameterizedType) {
            ParameterizedType pType = (ParameterizedType) gType;
            Type tType = pType.getRawType();
            System.out.println(tType);
            Type[] arrType = pType.getActualTypeArguments();
            for (int i = 0; i < arrType.length; i++) {
                System.out.println(arrType[i]);
            }
        }
    }

    @Test
    public void test() throws NoSuchFieldException, SecurityException {
        Class<GenericTest> clazz = GenericTest.class;

        Field f = clazz.getDeclaredField("score");
        Class<?> c = f.getType();
        System.out.println(c);
        Type gType = f.getGenericType();
        if (gType instanceof ParameterizedType) {
            ParameterizedType pType = (ParameterizedType) gType;
            Type tType = pType.getRawType();
            System.out.println(tType);
            Type[] arrType = pType.getActualTypeArguments();
            for (int i = 0; i < arrType.length; i++) {
                System.out.println(arrType[i]);
            }
        }
    }

}
