/*
 * 文件名：Book.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Book.java
 * 修改人：duanji
 * 修改时间：2015年12月29日
 * 修改内容：新增
 */
package com.better517na.demo.commonclass;

/**
 * ComparableTest 的辅助类.
 * 
 * @author duanji
 */
public class Book implements Comparable<Book> {

    private String name;

    private float price;

    private String press;

    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // 构造方法
    public Book(String name, float price, String press, String author) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        System.out.println(name.toString());
    }

    @Override
    public int compareTo(Book book) {
        if (book.price > this.price) {
            return 1;
        } else if (book.price < this.price) {
            return -1;
        } else {
            if ((this.name.compareTo(book.name)) > 0) {
                return 1;
            } else if (this.name.compareTo(book.name) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Book [书名=" + name + ", 价格=" + price + ", 出版社=" + press + ", 作者=" + author + "]";
    }

}
