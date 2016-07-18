/*
 * 文件名：Queue.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Queue.java
 * 修改人：duanji
 * 修改时间：2016年1月12日
 * 修改内容：新增
 */
package com.better517na.demo.crawler.geturl;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
import java.util.LinkedList;

public class Queue {

    private LinkedList queue;

    // 构造函数
    public Queue() {
        queue = new LinkedList();
    }

    // 入队列
    public void enQueue(Object elem) {
        queue.addLast(elem);
    }

    // 出队列
    public Object deQueue() {
        return queue.removeFirst();
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // 判断队列中是否含有某个元素
    public boolean contains(Object elem) {
        return queue.contains(elem);
    }
}
