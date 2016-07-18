/*
 * 文件名：TestBuffer.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestBuffer.java
 * 修改人：duanji
 * 修改时间：2016年2月25日
 * 修改内容：新增
 */
package com.better517na.demo.streams.nio;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.SortedMap;

import org.junit.Test;

/**
 * 测试Buffer 类的一些用法.
 * 
 * @author duanji
 */
public class TestBuffer {

    /**
     * 得到Buffer 实例.
     * 
     */
    @Test
    public void test() {
        // 获取一个java.nio.HeapByteBuffer 实例
        Buffer buffer = ByteBuffer.allocate(10);
        System.out.println(buffer.getClass());
        // 获取一个java.nio.HeapCharBuffer 实例
        buffer = CharBuffer.allocate(50);
        System.out.println(buffer.getClass());
    }

    @Test
    public void testBasicUse() {
        CharBuffer charBuffer = CharBuffer.allocate(10);
        System.out.println(0);
        System.out.println(charBuffer.position());
        System.out.println(charBuffer.limit());
        System.out.println(charBuffer.capacity());
        charBuffer.put('a');
        System.out.println(1);
        System.out.println(charBuffer.position());
        System.out.println(charBuffer.limit());
        System.out.println(charBuffer.capacity());
        charBuffer.put('b');
        System.out.println(2);
        System.out.println(charBuffer.position());
        System.out.println(charBuffer.limit());
        System.out.println(charBuffer.capacity());
        charBuffer.put('c');
        System.out.println(charBuffer.get(1));
    }

    @Test
    public void fileChannelToByteBuffer() {

    }

    /**
     * 获取这个版本的JDK支持的所有的字符集.
     * 
     */
    @Test
    public void getJavaAllCharSet() {
        SortedMap<String, Charset> map = Charset.availableCharsets();
        for (String alias : map.keySet()) {
            // 输出字符集对应的别名和其CharSet对象
            System.out.println(alias + "---->" + map.get(alias));
        }
    }

    /**
     * 如果获得一个字符集对象，两种方式.
     * 
     */
    @Test
    public void getCharSet() {
        // 1
        Charset charset = Charset.forName("GBK");
        // 2
        Charset charset1 = Charset.defaultCharset();
        System.out.println(charset); // GBK
        System.out.println(charset1); // UTF-8
    }

    @Test
    public void getSystemFileEncode() {
        System.out.println(System.getProperty("file.encoding"));
    }

    @Test
    public void testConversion() throws CharacterCodingException {
        Charset charset = Charset.forName("UTF-8");
        // 创建一个字符集对应的编码对象
        CharsetEncoder encoder = charset.newEncoder();
        // 创建一个字符集对应的解码对象
        CharsetDecoder decoder = charset.newDecoder();
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        CharBuffer charBuffer = CharBuffer.allocate(10);
        // byteBuffer -> charBuffer
        charBuffer = decoder.decode(byteBuffer);
        // charBuffer -> byteBuffer
        byteBuffer = encoder.encode(charBuffer);
    }

    @Test
    public void testEasyConversion() {
        Charset charset = Charset.forName("UTF-8");
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        CharBuffer charBuffer = CharBuffer.allocate(10);
        byteBuffer = charset.encode(charBuffer);
        charBuffer = charset.decode(byteBuffer);
        String str = "GBK";
        byteBuffer = charset.encode(str);
    }

    @Test
    public void testFiles() throws IOException {
        Path path = Paths.get("E:", "workspace", "Demo");
        System.out.println(path);
        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            /**
             * 访问文件时触发此方法.
             * 
             * @param file
             * @param attrs
             * @return
             * @throws IOException
             */
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("正在访问：" + file + "文件");
                if (file.endsWith("TestBuffer.java")) {
                    System.out.println("已经找到了目标！");
                    return FileVisitResult.TERMINATE;
                }
                return FileVisitResult.CONTINUE;
            }

            /**
             * 访问目录前触发此方法.
             * 
             * @param dir
             * @param attrs
             * @return
             * @throws IOException
             */
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("正在访问：" + dir + "目录");
                return FileVisitResult.CONTINUE;
            }
        });
    }

    @Test
    public void testFileVisitor() {
        // FileVisitor fileVisitor

    }

}
