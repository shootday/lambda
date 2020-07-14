package com.study.cn.entity;

/**
 * @program: lambda
 * @Date: 2020/7/14 20:41
 * @Author: lzx
 * @Description:
 */
public class Persion {

    public int age;


    public String name;

    public Persion() {
    }

    public Persion(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String show() {
        return "name" + name + "---age--" + age;
    }
}
