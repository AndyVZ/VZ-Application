package com.company.Lab9sql.model;

import java.io.Serializable;

/**
 * Created by VZ-RED on 01.12.2016.
 */
public class Abonent implements Serializable {
    private int userid;
    private String name;
    private int age;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Abonent{" + "id=" + userid + ", name=" + name + ", age='"+ age+'\'' + '}';
    }
}
