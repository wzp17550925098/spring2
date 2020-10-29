package com.usian.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author zjy
 * @create 2020-10-27 10:27
 */
public class Student {
    private  Integer id;
    private  String  name;
    private  Integer age;
    private  Integer sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday   ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
