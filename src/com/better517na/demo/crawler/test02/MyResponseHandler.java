/*
 * 文件名：MyResponseHandler.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： MyResponseHandler.java
 * 修改人：duanji
 * 修改时间：2016年1月12日
 * 修改内容：新增
 */
package com.better517na.demo.crawler.test02;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class MyResponseHandler implements ResponseHandler<Page> {

    @Override
    public Page handleResponse(HttpResponse response) throws ClientProtocolException, IOException {

        StatusLine statusLine = response.getStatusLine();
        HttpEntity entity = response.getEntity();
        // System.out.println(entity.getContentEncoding());
        if (statusLine.getStatusCode() >= 300) {
            EntityUtils.consume(entity);
            throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
        }

        if (entity == null)
            return null;

        // 利用HTTPClient自带的EntityUtils把当前HttpResponse中的HttpEntity转化成HTML代码
        String html = EntityUtils.toString(entity);

        // 解决乱码问题
        String finalHtml = new String(html.getBytes("ISO-8859-1"));
        Document document = Jsoup.parse(finalHtml);

        // System.out.println(document.head());
        Elements links = document.getElementsByTag("a");

        // 找出连接和他们对应的 text
        for (int i = 0; i < links.size(); i++) {
            Element link = links.get(i);
            // page.setAnchor(link.text());
            // System.out.println(link.text());
            // System.out.println(link.attr("href"));
        }

        // 找出其中的一个表数据
        Elements trs = document.select("div");
        System.out.println(trs.size());
        for (int i = 0; i < trs.size(); i++) {
            if (trs.get(i).id().equals("jykbindex")) {

                Elements ul = trs.get(i).select("ul");

                for (int j = 0; j < ul.size(); j++) {
                    Elements li = ul.get(j).select("li");
                    for (int k = 0; k < li.size(); k++) {
                        Elements span = li.get(k).select("span");
                        for (int s = 0; s < span.size(); s++) {
                            Element spa = span.get(s);
                            System.out.print(spa.text() + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.println();
            }
        }

        // parse context of plain text from HTML code,
        Elements paragraphs = document.getElementsByTag("p");
        StringBuffer plainText = new StringBuffer(html.length() / 2);
        for (int i = 0; i < paragraphs.size(); i++) {
            Element paragraph = paragraphs.get(i);
            plainText.append(paragraph.text()).append("\n");
        }
        // page.setPlainText(plainText.toString());
        return null;
    }

}
