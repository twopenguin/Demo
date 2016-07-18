/*
 * 文件名：ReadProperties.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ReadProperties.java
 * 修改人：duanji
 * 修改时间：2016年1月18日
 * 修改内容：新增
 */
package com.better517na.demo.streams;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 测试读取Properties 文件.
 * 
 * @author duanji
 */
public class ReadProperties {

    public static void main(String[] args) {
        Properties props = new Properties();
        FileInputStream istream = null;
        try {
            istream = new FileInputStream("");
            props.load(istream);
            istream.close();
            if (istream != null) {
                istream.close();
            }

        } catch (Exception e) {

        }
    }

}
