/*
 * 文件名：UserBo.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UserBo.java
 * 修改人：duanji
 * 修改时间：2016年1月21日
 * 修改内容：新增
 */
package com.better517na.demo.apache.beanutils.model;

import java.util.Date;
import java.util.Map;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class UserBo {

    private int age;

    private String name;

    private String address;

    private Date birth;

    private int[] arr;

    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    private InnerClass city;

    public InnerClass getCity() {
        return city;
    }

    //
    public void setCity(InnerClass city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserBo [age=" + age + ", name=" + name + ", address=" + address + ", birth=" + birth + ", city=" + city + "]";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
