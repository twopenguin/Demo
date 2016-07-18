/*
 * 文件名：GetSimpleContext.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： GetSimpleContext.java
 * 修改人：duanji
 * 修改时间：2016年1月11日
 * 修改内容：新增
 */
package com.better517na.demo.crawler;

import java.io.IOException;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class GetSimpleContext {

    /**
     * 以get的方式获取网页.
     * 
     * @throws HttpException
     * @throws IOException
     */
    @Test
    public void test00() throws HttpException, IOException {
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod("http://www.atguigu.com/");
        int statusCode = client.executeMethod(method);
        if (statusCode != HttpStatus.SC_OK) {
            System.err.println("Method failed: " + method.getStatusLine());
        }

        byte[] responseBody = method.getResponseBody();
        // 处理内容
        String html = new String(responseBody);
        System.out.println(html);
        method.releaseConnection();
    }

    /**
     * 以 post 获取网页.
     * 
     * @throws IOException
     */
    @Test
    public void test01() throws IOException {
        HttpClient httpClient = new HttpClient();
        PostMethod postMethod = new PostMethod("http://www.atguigu.com/");
        postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
        /*
         * NameValuePair[] data = {new NameValuePair("username", "aaa"), new NameValuePair("password", "bbb")}; postMethod.setRequestBody(data);
         */

        int statusCode = httpClient.executeMethod(postMethod);
        if (statusCode != HttpStatus.SC_OK) {
            System.err.println("Method failed: " + postMethod.getStatusLine());
        }
        // 读取内容
        byte[] responseBody = postMethod.getResponseBody();
        // 处理内容
        String html = new String(responseBody);
        System.out.println(html);

        postMethod.releaseConnection();
    }

    public void test02() {
        HttpClientBuilder builer = HttpClientBuilder.create();
        CloseableHttpClient closeableHttpClient = builer.build();
        HttpGet get = new HttpGet("http://www.atguigu.com/");
        System.out.println(get.getRequestLine());
        try {
            // String urlHeader = "http://www.atguigu.com/";
            /*
             * List lists = new ArrayList<>(); List list = new ArrayList<>();
             */

            HttpResponse httpResponse = closeableHttpClient.execute(get);

            HttpEntity entity = httpResponse.getEntity();

            System.out.println("Status:" + httpResponse.getStatusLine());

            if (entity != null) {
                System.out.println("contentEncoding:" + entity.getContentEncoding());

                String response = EntityUtils.toString(entity, "UTF-8");

                Document doc = Jsoup.parse(response);

                Elements element = doc.select("table");

                Elements tr = element.select("tr");

                for (int i = 0; i < tr.size(); i++) {
                    String[] strings = new String[4];

                    String[] tds = new String[4];

                    Element trs = tr.get(i);

                    Elements href = trs.select("a");

                    Elements td = trs.select("td");

                    for (int m = 0; i < td.size(); i++) {
                        Element tdpojo = td.get(m);

                        tds[m] = tdpojo.text();
                    }

                    for (int j = 0; j < href.size(); j++) {
                        Element hrefs = href.get(j);

                        strings[j] = hrefs.attr("href");
                    }

                }
            }

        } catch (Exception e) {

        }
    }

}
