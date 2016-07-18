/*
 * 文件名：BasicReflectTest.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： BasicReflectTest.java
 * 修改人：duanji
 * 修改时间：2016年1月20日
 * 修改内容：新增
 */
package com.better517na.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

import com.better517na.demo.reflect.model.Book;
import com.better517na.demo.reflect.model.TestModel;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class BasicReflectTest {

    @Test
    public void testBasicReflet() {
        Class clazz = TestModel.class;
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        // System.out.println(clazz.getModifiers());
        System.out.println(clazz.getDeclaredFields());
        System.out.println(clazz.getDeclaredMethods());

        // System.out.println(clazz.getFields());

        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println(clazz.getDeclaredConstructors());
        System.out.println(clazz.getDeclaredConstructors().length);
        for (Constructor constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println(clazz.getClass());
        System.out.println(clazz.getClasses());
        for (Class class1 : clazz.getClasses()) {
            System.out.println(class1);
        }

    }

    /**
     * 测试数组的默认打印格式.
     * 
     */
    @Test
    public void testArrayPrintFormat() {
        String[] strings = {"aa", "bb"};
        System.out.println(strings);
        Book[] books = {};
        System.out.println(books);
    }

}
