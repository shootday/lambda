package com.study.cn.reflex;

import com.study.cn.entity.Emp;

/**
 * @program: lambda
 * @Date: 2020/7/14 7:47
 * @Author: lzx
 * @Description:
 */
public class CreateClassObject {

    public static void main(String[] args) throws Exception {
        //1.通过class.forname()来获取class对象
        Class c = Class.forName("com.study.cn.entity.Emp");
        System.out.println(c.getPackage());
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println(c.getCanonicalName());

        //2.通过类名.class
        Class<Emp> empClass = Emp.class;

        //3.通过对象的getclass()
        Emp emp=new Emp();
        Class<? extends Emp> aClass = emp.getClass();

        //4.基本数据类型type
        Class<Integer> type = Integer.TYPE;
        Class<Integer> integerClass = Integer.class;
        Class<Integer[]> aClass1 = Integer[].class;


    }
}
