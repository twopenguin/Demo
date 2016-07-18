/*
 * 文件名：FileDemo.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： FileDemo.java
 * 修改人：duanji
 * 修改时间：2015年12月21日
 * 修改内容：新增
 */
package com.better517na.demo.streams;

import java.io.File;

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
public class FileDemo {

    private File file;

    /**
     * 构造函数.
     * 
     */
    public FileDemo(String fileString) {
        this.file = new File(fileString);
    }

    /**
     * 设置file.
     * 
     * @return 返回file
     */
    public File getFile() {
        return file;
    }

    /**
     * 获取file.
     * 
     * @param file
     *            要设置的file
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * 访问文件名相关的方法测试.
     * 
     */
    public void getFileNameMethods(String newFileName) {

        System.out.println("getAbsolutePath() 结果：" + file.getAbsolutePath());
        System.out.println("getName() 结果：" + file.getName());
        System.out.println("getPath() 结果：" + file.getPath());
        System.out.println("getAbsoluteFile() 结果：" + file.getAbsoluteFile());
        System.out.println("getParent() 结果：" + file.getParent());
        System.out.println("getParent() 结果：" + file.renameTo(new File(newFileName)));

    }

    public void fileDetectionMethods() {

    }

}
