/*
 * 文件名：FilenameFilterTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： FilenameFilterTest.java
 * 修改人：duanji
 * 修改时间：2015年12月29日
 * 修改内容：新增
 */
package com.better517na.demo.streams;

import java.io.File;

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
public class FilenameFilterTest {

    /**
     * 使用Lambda表达式来测试FilenameFilter的使用.
     * 
     */
    @Test
    public void test() {

        File file = new File(".");
        String[] namesList = file.list((dir, name) -> name.endsWith(".java") || new File(name).isDirectory());
        for (String temp : namesList) {
            System.out.println(temp);
        }
    }

}
