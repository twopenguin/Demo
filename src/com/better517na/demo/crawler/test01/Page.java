/*
 * 文件名：Page.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Page.java
 * 修改人：duanji
 * 修改时间：2016年1月12日
 * 修改内容：新增
 */
package com.better517na.demo.crawler.test01;

/**
 * 解析网页返回的实体类.
 * 
 * @author duanji
 */
public class Page {

    private String plainText;

    private String anchor;

    private String url;

    public Page(String url) {
        this.url = url;
    }

    public Page() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

}
