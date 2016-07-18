/*
 * 文件名：TestSynchronizedCollections.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestSynchronizedCollections.java
 * 修改人：duanji
 * 修改时间：2016年2月25日
 * 修改内容：新增
 */
package com.better517na.demo.thread.atomic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class TestSynchronizedCollections {

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        Collections.synchronizedList(list);
    }

    public void testBlockingQueue() {
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();
        blockingQueue = new ArrayBlockingQueue<String>(10);
        blockingQueue = new PriorityBlockingQueue<String>();
    }

}
