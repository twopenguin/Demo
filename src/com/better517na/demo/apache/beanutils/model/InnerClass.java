/*
 * 文件名：InnerClass.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： InnerClass.java
 * 修改人：duanji
 * 修改时间：2016年1月21日
 * 修改内容：新增
 */
package com.better517na.demo.apache.beanutils.model;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class InnerClass {

    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "InnerClass [cityName=" + cityName + "]";
    }

}
