/*
 * 文件名：CodeBlockDemo.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CodeBlockDemo.java
 * 修改人：duanji
 * 修改时间：2015年12月22日
 * 修改内容：新增
 */
package com.better517na.demo.codeblock;

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
public class CodeBlockDemo {

    @Test
    public void test() {
        CodeBlock block = new CodeBlockChild("I am a message!");
        System.out.println(block);
    }

}
