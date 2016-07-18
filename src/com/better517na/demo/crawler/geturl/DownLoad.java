/*
 * 文件名：DownLoad.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： DownLoad.java
 * 修改人：duanji
 * 修改时间：2016年1月12日
 * 修改内容：新增
 */
package com.better517na.demo.crawler.geturl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class DownLoad {

    private HttpClient httpClient;

    public DownLoad() {
        httpClient = new HttpClient();
    }

    // 根据路径下载页面
    public String downLoadPage(String path) throws HttpException, IOException {
        StringBuilder sb = new StringBuilder();
        GetMethod getMethod = new GetMethod(path);
        int status = httpClient.executeMethod(getMethod);
        BufferedReader br = null;
        if (status == HttpStatus.SC_OK) {
            br = new BufferedReader(new InputStreamReader(getMethod.getResponseBodyAsStream()));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } else if ((status == HttpStatus.SC_MOVED_PERMANENTLY) || (status == HttpStatus.SC_MOVED_TEMPORARILY) || (status == HttpStatus.SC_SEE_OTHER) || (status == HttpStatus.SC_TEMPORARY_REDIRECT)) {
            Header head = getMethod.getResponseHeader("location");
            if (head != null) {
                String newURL = head.getValue();
                if ((newURL == null) || newURL.equals("")) {
                    newURL = "/";
                    GetMethod getMethod1 = new GetMethod(newURL);
                    httpClient.equals(getMethod1);
                    br = new BufferedReader(new InputStreamReader(getMethod1.getResponseBodyAsStream()));
                    String line = null;
                    while ((line = br.readLine()) != null) {
                        sb.append(line);
                    }
                }
            }
        }
        return sb.toString();
    }

    // 获取网页并且进行保存
    // public void download(String path) throws IOException
    // {
    // BufferedWriter bw=new BufferedWriter(new FileWriter(new File(filename)));
    // bw.write(downLoadPage(path));
    // bw.flush();
    // bw.close();
    // }
    // 用于测试的主函数

    // public static void main(String[] args) { DownLoad downLoad=new DownLoad(); try { System.out.println(downLoad.downLoadPage("http://www.baidu.com")); } catch (HttpException e) { // TODO
    // catch block e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); } }
    //
}
