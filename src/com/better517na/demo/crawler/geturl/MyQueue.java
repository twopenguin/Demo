/*
 * 文件名：MyQueue.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： MyQueue.java
 * 修改人：duanji
 * 修改时间：2016年1月12日
 * 修改内容：新增
 */
package com.better517na.demo.crawler.geturl;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class MyQueue {

    // 已访问的URL的队列
    private Set visitedQueue;

    // 未访问的URL的队列
    private Queue unVisitedQueue;

    // 构造函数
    public MyQueue() {
        visitedQueue = new HashSet<String>();
        unVisitedQueue = new Queue();
    }

    // 加入已访问的队列
    public void addURL(String url) {
        visitedQueue.add(url);
    }

    // 返回已访问的队列
    public Set getVisited() {
        return this.visitedQueue;
    }

    // 移除访问过的URL
    public void removeUrl(String url) {
        visitedQueue.remove(url);
    }

    // 未访问过的URL出队列
    public String getUnVURL() {
        return (String) unVisitedQueue.deQueue();
    }

    // 加入未访问过的URL
    public void addUnVURL(String url) {
        if ((url != null) && (!url.trim().equals("") && (!visitedQueue.contains(url)) && (!unVisitedQueue.contains(url)))) {
            unVisitedQueue.enQueue(url);
        }
    }

    // 获得已访问的URL的数目
    public int getVisitedNum() {
        return visitedQueue.size();
    }

    // 判断未访问的队列是否为空
    public boolean isEmpty() {
        return unVisitedQueue.isEmpty();
    }

}
