/*
 * 文件名：TestAtomic.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestAtomic.java
 * 修改人：duanji
 * 修改时间：2016年2月24日
 * 修改内容：新增
 */
package com.better517na.demo.thread.atomic;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

/**
 * 测试java.util.concurrent.atomic 包下面的一些原子类的用法.
 * 
 * @author duanji
 */
public class TestAtomic {

    @Test
    public void test() {
        AtomicReference<Integer> lastNumber = new AtomicReference<Integer>();
        AtomicReference<Integer> lastFactors = new AtomicReference<Integer>();
        lastNumber.get();
    }

}
