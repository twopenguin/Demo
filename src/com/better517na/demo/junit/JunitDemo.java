/*
 * 文件名：JunitTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： JunitTest.java
 * 修改人：duanji
 * 修改时间：2015年12月18日
 * 修改内容：新增
 */
package com.better517na.demo.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * 
 * <pre>
 * </pre>
 * 
 * @author duanji
 */
public class JunitDemo {

    private static int i, j;

    @BeforeClass
    public static void init() {
        System.out.println("init");
        i = 0;
        j = 0;
    }

    @Before
    public void invokeBefore() {
        System.out.println("invokeBefore" + ++i);
    }

    @Test
    public void testMyMethod1() {
        System.out.println("testMyMethod1");
    }

    @Test
    public void testMyMethod2() {
        System.out.println("testMyMethod2");
    }

    @After
    public void invokeAfter() {
        System.out.println("invokeAfter" + ++j);
    }

    @AfterClass
    public static void destroy() {
        System.out.println("destroy");
        i = 0;
        j = 0;
    }
}
