/*
 * 文件名：ComparableImpl.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ComparableImpl.java
 * 修改人：duanji
 * 修改时间：2015年12月29日
 * 修改内容：新增
 */
package com.better517na.demo.commonclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试Comparable 接口的使用.
 * 
 * @author duanji
 */
public class ComparableTest {

    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        Book b1 = new Book("java1", 25f, "不错的书", "LY1");
        Book b2 = new Book("java2", 26f, "不错的书", "LY2");
        Book b3 = new Book("bcva3", 26f, "不错的书", "LY3");
        Book b4 = new Book("bava4", 26f, "不错的书", "LY4");
        Book b5 = new Book("java5", 15f, "不错的书", "LY5");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            Book book = (Book) list.get(i);
            System.out.println(book);
        }
    }

}
