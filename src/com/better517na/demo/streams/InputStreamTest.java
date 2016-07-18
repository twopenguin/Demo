/*
 * 文件名：InputStreamTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： InputStreamTest.java
 * 修改人：duanji
 * 修改时间：2015年12月29日
 * 修改内容：新增
 */
package com.better517na.demo.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

/**
 * 测试一些流的相关类的基本使用.
 * 
 * @author duanji
 */
public class InputStreamTest {

    /**
     * 测试 FileInputStream 的基本使用.
     * 
     * @throws IOException
     */
    @Test
    public void testRead() throws IOException {
        String path = this.getClass().getResource("").getPath();
        System.out.println(path);
        InputStream inputStream = new FileInputStream("/E:/workspace/Demo/src/com/better517na/demo/streams/" + "InputStreamTest.java");
        byte[] buff = new byte[1024];
        int hasRead = 0;

        while ((hasRead = inputStream.read(buff)) > 0) {
            System.out.println(new String(buff, 0, hasRead));
        }
        inputStream.close();
        // 程序里打开的IO资源不属于内存中的资源，垃圾回收器不能回收这种资源，我们需要自己显示的关闭
    }

    /**
     * 测试自动关闭 close.
     * 
     */
    public void testAutoClose() {
        String path = this.getClass().getResource("").getPath();
        System.out.println(path);
        // 就是 try 后面的括号 就是自动 try 语句
        try (InputStream inputStream = new FileInputStream("/E:/workspace/Demo/src/com/better517na/demo/streams/" + "InputStreamTest.java")) {

            byte[] buff = new byte[1024];
            int hasRead = 0;
            while ((hasRead = inputStream.read(buff)) > 0) {
                System.out.println(new String(buff, 0, hasRead));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 程序里打开的IO资源不属于内存中的资源，垃圾回收器不能回收这种资源，我们需要自己显示的关闭
    }

    /**
     * 测试 StringWriter 和StringReader 两个流类.
     * 
     */
    @Test
    public void testStringReaderAndWriter() {
        String string = "从明天起，做一个幸福的人，开始喂马、劈材、周游世界。从明天起开始关心粮食和蔬菜。我又一所房子，面朝大海，春暖花开。从明天开始，和每一个亲人通信，告诉他们我的幸福！";
        char[] buffer = new char[32];
        int hasRead = 0;
        try (StringReader reader = new StringReader(string)) {
            while ((hasRead = reader.read(buffer)) > 0) {
                // 注释的这种写法是会出现错误的
                // System.out.println(buffer);
                System.out.println(new String(buffer, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用 InputStreamReader 以行的形式从控制台获取数据.
     * 
     */
    @Test
    public void testInputStreamReader() {
        try (
                // 将 System.in 对象 转换成 InputStreamReader 对象
                InputStreamReader reader = new InputStreamReader(System.in, "UTF-8");
                // 将普通的Reader 包装成 BufferReader
                BufferedReader bufferedReader = new BufferedReader(reader);) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("exit")) {
                    System.exit(1);
                }
                System.out.println("your input is：" + line);
            }
            System.out.println("this programe is done!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过 RandomAccessFile 向文件尾部添加内容.
     * 
     * @throws FileNotFoundException
     */
    @Test
    public void testAddIntoFile() throws FileNotFoundException {

        try (RandomAccessFile raf = new RandomAccessFile(new File("D:/note.txt"), "rw")) {
            raf.seek(raf.length());
            raf.write("哈哈我来了".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEncoding() throws UnsupportedEncodingException, FileNotFoundException {
        InputStreamReader reader = new InputStreamReader(System.in, "GBK");
        System.out.println(reader.getEncoding());

    }

}
