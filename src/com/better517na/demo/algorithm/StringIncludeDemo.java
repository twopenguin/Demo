/*
 * 文件名：StringInclude.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： StringInclude.java
 * 修改人：duanji
 * 修改时间：2015年12月28日
 * 修改内容：新增
 */
package com.better517na.demo.algorithm;

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
public class StringIncludeDemo {

    public static void main(String[] args) {
        String a = "AABCD";
        String b = "CDAB";
        String c = a + a;
        if (c.indexOf(b) != -1) {
            System.out.println("可以获得");
        }
    }

    public static boolean isInclude(String source, String target) {
        String temp = source + source;
        if (temp.indexOf(target) != -1) {
            return true;
        }
        return false;
    }

}
