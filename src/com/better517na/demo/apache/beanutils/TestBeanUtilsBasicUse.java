/*
 * 文件名：TestBeanUtilsBasicUse.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestBeanUtilsBasicUse.java
 * 修改人：duanji
 * 修改时间：2016年1月21日
 * 修改内容：新增
 */
package com.better517na.demo.apache.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Before;
import org.junit.Test;

import com.better517na.demo.apache.beanutils.model.InnerClass;
import com.better517na.demo.apache.beanutils.model.UserBo;
import com.better517na.demo.apache.beanutils.model.UserVo;

/**
 * 测试BeanUtils lei的一些基本使用.
 * 
 * @author duanji
 */
public class TestBeanUtilsBasicUse {

    /**
     * 测试BeanUtils.copyProperties 方法.
     * 
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public UserBo bo;

    public UserVo vo;

    @Test
    public void testCase1() throws IllegalAccessException, InvocationTargetException {

        // vo.setAddress(bo.getAddress());
        BeanUtils.copyProperties(vo, bo);
        System.out.println(vo);
        System.out.println(bo);

    }

    @Test
    public void testCase2() throws Exception {
        // 动态获取属性
        System.out.println(BeanUtils.getProperty(bo, "address"));
        // 动态获取内嵌属性
        System.out.println(BeanUtils.getProperty(bo, "city.cityName"));
    }

    public void testCase3() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        List<String> strings = new ArrayList<>();
        strings.add("11111");
        strings.add("22222");
        BeanUtils.getProperty(strings, "");

    }

    @Test
    public void testCloneBean() throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        UserBo newUserBo = (UserBo) BeanUtils.cloneBean(bo);
        System.out.println(newUserBo);
        System.out.println(newUserBo == bo);
        System.out.println(newUserBo.equals(bo));
        System.out.println((newUserBo.hashCode() == bo.hashCode()));
        // 浅复制
        System.out.println(newUserBo.getCity() == bo.getCity());
        newUserBo.getCity().setCityName("dali");
        // 由这儿看出实现的是浅复制
        System.out.println(bo);
        /*
         * Clone a bean based on the available property getters and setters, even if the bean class itself does not implement Cloneable.
         */
    }

    /**
     * 测试 copyProperties 有点类似clone.
     * 
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    @Test
    public void testCopyProperties() throws IllegalAccessException, InvocationTargetException {
        UserVo newVo = new UserVo();
        BeanUtils.copyProperties(newVo, bo);
        // System.out.println(newVo.getCity() == bo.getCity());
        System.out.println(newVo);
        newVo.getCity().setCityName("hehe");
        System.out.println(bo);
    }

    @Test
    public void testCopyProperty() throws IllegalAccessException, InvocationTargetException {
        UserVo newVo = new UserVo();
        InnerClass city = new InnerClass();
        city.setCityName("sichuan");
        BeanUtils.copyProperty(newVo, "city", city);
        System.out.println(newVo);
        // 如果 property 不存在，直接不做任何的处理
        BeanUtils.copyProperty(newVo, "innerClass", bo);
        System.out.println(newVo);
        BeanUtils.copyProperty(newVo, "age", 3);
        // 如果 property 但是类型不匹配，比如bo 和 name的类型不匹配，但是name是String类型的，也不报错，转化为一个String
        BeanUtils.copyProperty(newVo, "name", bo);
        System.out.println(newVo);
    }

    /**
     * describe 方法把一个bean 转化为一个 HashMap<String,String> 类型的.
     * 
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    @Test
    public void testDescribe() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Map map = BeanUtils.describe(bo);
        System.out.println(map);
    }

    /**
     * 获取含有索引的属性的某个特定索引的值，写法可以是属性名 +[]不能是.或者是括号.
     * 
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    @Test
    public void testGetIndexProperty() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        System.out.println(BeanUtils.getIndexedProperty(bo, "arr[1]"));
        System.out.println(BeanUtils.getIndexedProperty(bo, "arr.0"));
    }

    @Test
    public void testGetArrayProperty() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        System.out.println(BeanUtils.getArrayProperty(bo, "arr"));
        for (String str : BeanUtils.getArrayProperty(bo, "arr")) {
            System.out.println(str);
        }
    }

    @Test
    public void testGetMappedProperty() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        // System.out.println(BeanUtils.getMappedProperty(bo, "map(11)"));
        // System.out.println(BeanUtils.getMappedProperty(bo, "map(22)"));
        System.out.println(BeanUtils.getMappedProperty(bo, "map(city)"));

    }

    @Before
    public void init() {
        bo = new UserBo();
        bo.setAddress("jinyandao");
        bo.setAge(15);
        bo.setName("Tom");
        int[] arrs = {12, 23};
        InnerClass city = new InnerClass();
        city.setCityName("kunming");
        bo.setArr(arrs);
        bo.setCity(city);
        bo.setBirth(new Date());
        Map maps = new HashMap<>();
        maps.put("11", city);
        maps.put("22", arrs);
        maps.put(city, "kunming");
        bo.setMap(maps);
        vo = new UserVo();

    }

}
