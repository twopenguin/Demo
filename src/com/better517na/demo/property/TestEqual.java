/*
 * 文件名：TestEqual.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestEqual.java
 * 修改人：duanji
 * 修改时间：2016年1月7日
 * 修改内容：新增
 */
package com.better517na.demo.property;

import org.junit.Test;

/**
 * 测试失败.
 * 
 * @author duanji
 */
public class TestEqual {
    @Test
    public void test1() {
        String s1 = "kjfdslakfaslkjdfalsalksdfasldkf";
        String s2 = "kjfdslakfaslkjdfalsalksdfasldkf";
        String s3 = new String("kjfdslakfaslkjdfalsalksdfasldkf");
        String s4 = new String("kjfdslakfaslkjdfalsalksdfasldkf");
        long count = 0L;
        for (int i = 0; i < 5000000; i++) {
            if (s1 == s2) {
                count += 1;
            }
        }
    }

}
