/*
 * 文件名：TestMapo.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestMapo.java
 * 修改人：duanji
 * 修改时间：2016年2月26日
 * 修改内容：新增
 */
package com.better517na.demo.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述.
 * 
 * @author duanji
 */
public class TestMapo {

    @Test
    public void test() {
        Map<String, String> map = new HashMap();
        map = new LinkedHashMap<>();
    }

}
