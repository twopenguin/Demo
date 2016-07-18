/*
 * 文件名：CodeBlockChild.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CodeBlockChild.java
 * 修改人：duanji
 * 修改时间：2015年12月22日
 * 修改内容：新增
 */
package com.better517na.demo.codeblock;

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
public class CodeBlockChild extends CodeBlock {

    public CodeBlockChild() {
        System.out.println("child's non-parameter constructor ...");
    }

    public CodeBlockChild(String url) {
        System.out.println("child's the url is " + url);
    }

    {
        System.out.println("child's first code block ...");
    }

    static {
        System.out.println("child's static code block ...");
    }

}
