/*
 * 文件名：Client.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Client.java
 * 修改人：duanji
 * 修改时间：2016年5月25日
 * 修改内容：新增
 */
package com.better517na.demo.reflect.proxy;

import java.util.Map;

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
public class Client {

    public static void main(String[] args) {
        BusinessHandler businessHandler = new BusinessHandler();
        UserManager userManager = (UserManager) businessHandler.newProxyInstance(new UserManagerImpl());

        // userManager.addUser("0001", "张三");
        // userManager.delUser("0001");
        // System.out.println(userManager.getClass().getName());

        String name = userManager.test("0001");
        // String name = ((UserManagerImpl) logHandler.newProxyInstance(new UserManagerImpl())).test("0001");
        System.out.println("Client.main() --- " + name);
        Map<Thread, StackTraceElement[]> stackTraceElements = Thread.currentThread().getAllStackTraces();
        for (Map.Entry<Thread, StackTraceElement[]> element : stackTraceElements.entrySet()) {
            System.out.println(element.getKey().getName());
            StackTraceElement[] sElements = element.getValue();
            for (StackTraceElement ele : sElements) {
                System.out.println(ele);
            }
        }
    }

    @Test
    public void testProxy() {

    }

}
