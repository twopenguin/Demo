/*
 * 文件名：ScannerFileSystemTest.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ScannerFileSystemTest.java
 * 修改人：duanji
 * 修改时间：2016年1月5日
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
public class ScannerFileSystemTest {

    /**
     * Test method for {@link com.better517na.demo.streams.ScannerFileSystem#listDir(java.io.File, int)}.
     */
    @Test
    public void testListDir() {
        ScannerFileSystem fileSystem = new ScannerFileSystem();
        fileSystem.listDir(new File("E:/KuGou"), 0);
    }

}
