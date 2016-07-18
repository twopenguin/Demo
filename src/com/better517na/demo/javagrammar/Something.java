/*
 * 文件名：Something.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Something.java
 * 修改人：duanji
 * 修改时间：2016年2月16日
 * 修改内容：新增
 */
package com.better517na.demo.javagrammar;

/**
 * 测试方法的形参是否能被final修饰.
 * 
 * @author duanji
 */

public class Something {
    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
    }

    public void addOne(final Other o) {
        o.i++;
    }
    // 测试结果，方法的形参是可以被final修饰的，不会报错
}

class Other {
    public int i;
}
