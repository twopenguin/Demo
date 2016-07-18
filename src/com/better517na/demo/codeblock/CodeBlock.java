/*
 * 文件名：CodeBlock.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CodeBlock.java
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
public class CodeBlock {

    public CodeBlock() {
        System.out.println("no-parameter constructor...");
    }

    public CodeBlock(String message) {
        System.out.println("the constructor's message is " + message);
    }

    {
        System.out.println("first code block ...");
    }

    static {
        System.out.println("static code block ...");
    }

}
