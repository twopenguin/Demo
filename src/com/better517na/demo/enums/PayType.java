/*
 * 文件名：PayType.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： PayType.java
 * 修改人：duanji
 * 修改时间：2015年12月24日
 * 修改内容：新增
 */
package com.better517na.demo.enums;

/**
 * @author duanji
 */
public enum PayType {

    /**
     * 付款.
     */
    PAY(1, "付款"),

    /**
     * 退款.
     */
    REFOUND(2, "退款");

    /**
     * 值.
     */
    private final int value;

    /**
     * 描述.
     */
    private final String desc;

    /**
     * 构造函数.
     * 
     * @param value
     *            值
     * @param desc
     *            描述
     */
    // 构造器必须是私有的
    private PayType(int value, String desc) {
        this.desc = desc;
        this.value = value;
    }

    /**
     * 设置value.
     * 
     * @return 返回value
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + "-" + desc;
    }

    /**
     * 设置desc.
     * 
     * @return 返回desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 通过描述匹配.
     * 
     * @param desc
     *            desc
     * @return PayTypeEnum
     */
    public static PayType matchByDesc(String desc) {
        for (PayType payTypeEnum : PayType.values()) {
            if (desc.equals(payTypeEnum.getDesc())) {
                return payTypeEnum;
            }
        }
        throw new IllegalArgumentException("PayTypeEnum not find!");
    }

    /**
     * 通过值匹配.
     * 
     * @param value
     *            value
     * @return PayTypeEnum
     */
    public static PayType matchByValue(int value) {
        for (PayType payTypeEnum : PayType.values()) {
            if (value == payTypeEnum.getValue()) {
                return payTypeEnum;
            }
        }
        throw new IllegalArgumentException("PayTypeEnum not find!");
    }
}
