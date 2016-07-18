/*
 * 文件名：Test01.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Test01.java
 * 修改人：duanji
 * 修改时间：2016年1月12日
 * 修改内容：新增
 */
package com.better517na.demo.crawler.test01;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class Test01 {

    HttpClient httpclient;

    PageResponseHandler pageResponseHandler;

    final String url = "http://news.163.com/13/0903/11/97RHS2NS0001121M.html";

    Page page = new Page(url);

    @Before
    public void setUp() throws Exception {
        httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);
        pageResponseHandler = new PageResponseHandler(page);
        httpclient.execute(httpget, pageResponseHandler);
    }

    @After
    public void tearDown() throws Exception {
        httpclient.getConnectionManager().shutdown();
    }

    @Test
    public void test() {
        System.out.println("**********************");
        System.out.println(page.getPlainText());
        System.out.println("**********************");
        System.out.println(page.getAnchor());
        assertTrue(page.getPlainText().length() > 0);
    }

    @Test
    public void test1() throws ClientProtocolException, IOException {
        HttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet("http://news.163.com/13/0903/11/97RHS2NS0001121M.html");
        client.execute(get, new PageResponseHandler(new Page()));
    }

    public void test2() throws IOException {
        Document document = Jsoup.connect("http://news.163.com/13/0903/11/97RHS2NS0001121M.html").get();
        System.out.println(document);
        Elements links = document.getElementsByTag("a");
        for (int i = 0; i < links.size(); i++) {
            Element link = links.get(i);
            // page.setAnchor(link.text());
            System.out.println(link.text());
            System.out.println(link.attr("href"));
        }

        // parse context of plain text from HTML code,
        Elements paragraphs = document.getElementsByTag("p");
        StringBuffer plainText = new StringBuffer();
        for (int i = 0; i < paragraphs.size(); i++) {
            Element paragraph = paragraphs.get(i);
            plainText.append(paragraph.text()).append("\n");
        }
        // page.setPlainText(plainText.toString());
    }

    public void test3() throws IOException {

        Jsoup.connect("http://baidu.com").timeout(5000).post();
    }

}
