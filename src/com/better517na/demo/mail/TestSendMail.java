/*
 * 文件名：TestSendMail.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestSendMail.java
 * 修改人：duanji
 * 修改时间：2016年4月1日
 * 修改内容：新增
 */
package com.better517na.demo.mail;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

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
public class TestSendMail {

    /**
     * TODO 添加方法注释.
     * 
     * @param args
     */
    public static void main(String[] args) {

        try {
            MultiPartEmail email = new MultiPartEmail();

            email.setHostName("mail.517na.com");
            email.setAuthentication("duanji", "123456My");// 邮件服务器验证：用户名/密码
            email.setCharset("UTF-8");

            email.setFrom("duanji@517na.com", "端己(张昌达)-研发中心");
            email.addTo("qianghuo@517na.com");

            email.setSubject("加油奋斗！");
            email.setMsg("come on! ");
            /*
             * EmailAttachment attachment = new EmailAttachment(); attachment.setPath("d:/lzl.jpg");// 本地文件 attachment.setDisposition(EmailAttachment.ATTACHMENT); attachment.setDescription("林志玲1");
             * attachment.setName("lzl_1"); email.attach(attachment);
             */
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }

}
