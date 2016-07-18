/*
 * 文件名：TestModel.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestModel.java
 * 修改人：duanji
 * 修改时间：2016年1月20日
 * 修改内容：新增
 */
package com.better517na.demo.reflect.model;

import java.util.Map;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class TestModel {

    Map<String, Book> collec;

    public Map<String, Book> getCollec() {
        return collec;
    }

    public void setCollec(Map<String, Book> collec) {
        this.collec = collec;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private int age;

    private String Name;

    public void say(String message) {
        System.out.println(message);
    }

}
