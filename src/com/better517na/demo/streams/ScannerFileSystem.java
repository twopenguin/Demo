/*
 * 文件名：ScannerFileSystem.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ScannerFileSystem.java
 * 修改人：duanji
 * 修改时间：2016年1月5日
 * 修改内容：新增
 */
package com.better517na.demo.streams;

import java.io.File;

/**
 * 使用递归来查询一个目录下所有的目录和文件.
 * 
 * @author duanji
 */
public class ScannerFileSystem {
    public void listDir(File dir, int level) {
        File[] files = dir.listFiles();
        level++;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.err.println(getLevel(level) + files[i].getName());
                listDir(files[i], level);

            } else if (files[i].isFile()) {
                System.out.println(getLevel(level) + files[i].getName());
            }
        }
    }

    public String getLevel(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append("|--");
        for (int x = 0; x < level; x++) {
            sb.insert(0, "   ");
        }
        return sb.toString();
    }
}
