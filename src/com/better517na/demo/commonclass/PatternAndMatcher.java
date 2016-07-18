/*
 * 文件名：PatternAndMatcher.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： PatternAndMatcher.java
 * 修改人：duanji
 * 修改时间：2015年12月28日
 * 修改内容：新增
 */
package com.better517na.demo.commonclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 测试java 中关于正则表达式的Pattern 类和 Matcher 类的使用.
 * 
 * @author duanji
 */
public class PatternAndMatcher {

    /**
     * 测试正则表达式在java 中的基本使用. 这种使用Pattern的方式可以重复使用
     */
    @Test
    public void testBasic() {
        // 预编译一个字符串的Pattern
        Pattern pattern = Pattern.compile("a*b");
        // 使用pattern 对象,创建 Matcher 对象
        Matcher matcher = pattern.matcher("aaaaab");
        boolean isMatch = matcher.matches();
        System.out.println(isMatch);
    }

    /**
     * 如果正则表达式仅仅只是使用一次可以使用如下的方式,这种方式每次都要编译，所有效率不高.
     */
    @Test
    public void testPatternMatches() {
        boolean isMatch = Pattern.matches("a*b", "aaaaab");
        System.out.println(isMatch);
    }

    /**
     * 使用 Pattern 与 Matcher 来查找所有的 phone number.
     */
    @Test
    public void testGetPhoneNumber() {
        String string = "我想求购一本《疯狂java 讲义》，尽快联系我13500006666" + "交朋友，电话号码是13611125565" + "出售二手电脑，联系方式15899903312";
        Pattern pattern = Pattern.compile("((13\\d)|(15\\d))\\d{8}");
        Matcher matcher = pattern.matcher(string);
        // 使用 Matcher 的find 方法依次判断是否还有字符串与Pattern匹配
        while (matcher.find()) {
            // 使用 group 方法来
            System.out.println(matcher.group());
        }
    }

    /**
     * 测试Matcher 的 start 方法 和 end 方法.
     */
    @Test
    public void testStartAndEnd() {
        String string = "Java is very easy!";
        System.out.println("target characters is :" + string);
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(string);
        // 使用 Matcher 的find 方法依次判断是否还有字符串与Pattern匹配
        int count = 0;
        while (matcher.find()) {
            // 使用 group 方法来
            System.out.print("The result " + count + "<" + matcher.group() + ">");
            System.out.print(" from " + matcher.start()); // 使用 start 方法来确定子串的开始位置
            System.out.println(" to " + matcher.end()); // 使用 end 方法来确定子串的的结束位置
            count++;
        }
    }

}
