package com.usian.entity;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author zjy
 * @create 2020-10-27 18:34
 */
public class MyEmal {
    /**
     * host: smtp.qq.com #发送邮件服务器
     *       username: 1084200013@qq.com #发送邮件的邮箱地址
     *       password: tnycpaiscwnnbafe #客户端授权码，不是邮箱密码，这个在qq邮箱设置里面自动生成的
     *       properties.mail.smtp.port: 465 #端口号465或587
     *       from: 1084200013@qq.com #
     */

    private String from;
    @Value("${spring.mail.username}")
    private String to;
    private String cretetime;
    private String  text;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCretetime() {
        return cretetime;
    }

    public void setCretetime(String cretetime) {
        this.cretetime = cretetime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MyEmal{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", cretetime='" + cretetime + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
