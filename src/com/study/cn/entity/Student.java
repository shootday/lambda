package com.study.cn.entity;

/**
 * @program: lambda
 * @Date: 2020/7/14 20:43
 * @Author: lzx
 * @Description:
 */
public class Student extends  Persion {

    public  String className;

    private String address;

    public Student() {
        super();
    }

    public Student(String className, String address) {
        this.className = className;
        this.address = address;
    }

    public Student(int age, String name, String className, String address) {
        super(age, name);
        this.className = className;
        this.address = address;
    }

    private Student(String className) {
        this.className = className;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String eat() {
        return "name" + name + "---age--" + age;
    }

    private String add(int age) {
        System.out.println("adddd---"+age);
        return "---add--" + age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
