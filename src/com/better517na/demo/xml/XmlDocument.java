/*
 * 文件名：XmlDocument.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： XmlDocument.java
 * 修改人：duanji
 * 修改时间：2016年1月15日
 * 修改内容：新增
 */
package com.better517na.demo.xml;

/**
 * 定义XML 文件创建和解析的接口.
 * 
 * @author duanji
 */
public interface XmlDocument {
    /**
     * 建立XML文档
     * 
     * @param fileName
     *            文件全路径名称
     */
    public void createXml(String fileName);

    /**
     * 解析XML文档
     * 
     * @param fileName
     *            文件全路径名称
     */
    public void parserXml(String fileName);
}
