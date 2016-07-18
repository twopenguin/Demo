/*
 * 文件名：UserVo.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UserVo.java
 * 修改人：duanji
 * 修改时间：2016年1月21日
 * 修改内容：新增
 */
package com.better517na.demo.apache.beanutils.model;

import java.util.Date;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class UserVo {

    private int age;

    private String name;

    private String address;

    private String phoneNumber;

    private InnerClass city;

    private Date birth;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public InnerClass getCity() {
        return city;
    }

    public void setCity(InnerClass city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "UserVo [age=" + age + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", city=" + city + ", birth=" + birth + "]";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
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
