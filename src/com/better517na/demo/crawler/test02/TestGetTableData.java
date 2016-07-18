/*
 * 文件名：TestGetTableData.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestGetTableData.java
 * 修改人：duanji
 * 修改时间：2016年1月12日
 * 修改内容：新增
 */
package com.better517na.demo.crawler.test02;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.jsoup.Jsoup;
import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class TestGetTableData {

    @Test
    public void test() throws ClientProtocolException, IOException {
        HttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet("http://www.atguigu.com/");
        client.execute(get, new MyResponseHandler());
    }

    public void test1() throws MalformedURLException, IOException {
        String url = "http://www.atguigu.com/";
        Jsoup.parse(new URL(url).openStream(), "UTF-8", url);
    }

}
