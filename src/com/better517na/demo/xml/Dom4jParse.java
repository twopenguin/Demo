/*
 * 文件名：Dom4jParse.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Dom4jParse.java
 * 修改人：duanji
 * 修改时间：2016年1月15日
 * 修改内容：新增
 */
package com.better517na.demo.xml;

import java.io.File;   
import java.io.FileWriter;   
import java.io.IOException;   
import java.io.Writer;   
import java.util.Iterator;   

import org.dom4j.Document;   
import org.dom4j.DocumentException;   
import org.dom4j.DocumentHelper;   
import org.dom4j.Element;   
import org.dom4j.io.SAXReader;   
import org.dom4j.io.XMLWriter;   

/**
 * Dom4j 生成XML文档与解析XML文档.
 * 
 * @author duanji
 */
public class Dom4jParse implements XmlDocument {

    public void createXml(String fileName) {
        Document document = DocumentHelper.createDocument();
        Element employees = document.addElement("employees");
        Element employee = employees.addElement("employee");
        Element name = employee.addElement("name");
        name.setText("ddvip");
        Element sex = employee.addElement("sex");
        sex.setText("m");
        Element age = employee.addElement("age");
        age.setText("29");
        try {
            Writer fileWriter = new FileWriter(fileName);
            XMLWriter xmlWriter = new XMLWriter(fileWriter);
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }

    public void parserXml(String fileName) {
        File inputXml = new File(fileName);
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(inputXml);
            Element employees = document.getRootElement();
            for (Iterator i = employees.elementIterator(); i.hasNext();) {
                Element employee = (Element) i.next();
                for (Iterator j = employee.elementIterator(); j.hasNext();) {
                    Element node = (Element) j.next();
                    System.out.println(node.getName() + ":" + node.getText());
                }

            }
        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("dom4j parserXml");
    }

}
