/*
 * 文件名：BusinessHandler.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： BusinessHandler.java
 * 修改人：duanji
 * 修改时间：2016年5月25日
 * 修改内容：新增
 */
package com.better517na.demo.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
public class BusinessHandler implements InvocationHandler {

    private Object targetObject;

    public Object newProxyInstance(Object targetObject) {

        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start-->>" + method.getName());
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        Object ret = null;
        try {
            // 调用目标方法
            ret = method.invoke(targetObject, args);
            System.out.println("success-->>" + method.getName());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error-->>" + method.getName());
            throw e;
        }
        return ret;
    }

}