/*
 * 文件名：Member.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Member.java
 * 修改人：duanji
 * 修改时间：2016年6月22日
 * 修改内容：新增
 */
package com.better517na.demo.annotation.model;

import java.io.Serializable;

import com.dobby.plugins.annotation.AbolishedField;
import com.dobby.plugins.annotation.GeneratorField;
import com.dobby.plugins.annotation.GeneratorTable;

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
// 映射表别名
@GeneratorTable(name = "tb_member")
public class Member implements Serializable {

    /**
     * 添加字段注释.
     */
    private static final long serialVersionUID = 1L;

    // 映射该字段,并且为主键,自定义字段别名
    @GeneratorField(primaryKey = true, name = "m_Id")
    private Integer id;

    @GeneratorField(name = "member_name")
    private String memberName;

    // 映射时不映射该字段
    @AbolishedField
    private String address;

    // 不使用注解,默认为使用属性名进行映射
    private String zipCode;

    // getter and setter
}
