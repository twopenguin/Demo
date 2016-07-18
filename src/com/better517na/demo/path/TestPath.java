/*
 * 文件名：TestPath.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestPath.java
 * 修改人：duanji
 * 修改时间：2016年3月9日
 * 修改内容：新增
 */
package com.better517na.demo.path;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.junit.Test;

import junit.framework.Assert;

/**
 * 学习关于Java 路径的问题.
 * 
 * @author duanji
 */
public class TestPath {

    @Test
    public void test() {
        InputStream stream = getClass().getResourceAsStream("readme.txt");
        Assert.assertNotNull(stream);
        System.out.println(stream);
    }

    @Test
    public void test0() throws IOException {
        InputStream stream = getClass().getResourceAsStream("/justForTest.properties");
        Properties properties = new Properties();
        properties.load(stream);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("passWord"));
        Assert.assertNotNull(stream);
        System.out.println(stream);
    }

    @Test
    public void testURL() {
        URL url = getClass().getResource("/justForTest.properties");
        String string = getClass().getResource("/justForTest.properties").getPath();
        System.out.println(url);
        System.out.println(string);
    }

    @Test
    public void testGetClassLoader() {
        InputStream inputStream1 = this.getClass().getClassLoader().getResourceAsStream("com/better517na/demo/path/readme.txt");
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/justForTest.properties");
        System.out.println(inputStream);
        System.out.println(inputStream1);

    }

}
