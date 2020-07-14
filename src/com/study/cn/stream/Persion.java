package com.study.cn.stream;

/**
 * @program: lambda
 * @Date: 2020/6/15 14:35
 * @Author: lzx
 * @Description:
 */

public class Persion {


    private String name;

    public static Persion bulid(String name) {
        Persion persion = new Persion(name);
        return persion;
    }


    public Persion() {
    }
    
    public Persion(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                '}';
    }
}
