package com.study.cn.entity;

/**
 * @program: lambda
 * @Date: 2020/7/14 7:50
 * @Author: lzx
 * @Description:
 */
public class Emp {

  private  int id;


  private String name;


    public Emp() {
    }

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
