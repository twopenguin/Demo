/*
 * 文件名：UserManagerImpl.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UserManagerImpl.java
 * 修改人：duanji
 * 修改时间：2016年5月25日
 * 修改内容：新增
 */
package com.better517na.demo.reflect.proxy;

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
public class UserManagerImpl implements UserManager {

    public String test(String userId) {
        System.out.println("UserManagerImpl.findUser() userId-->>" + userId);
        return "张三";
    }

}
