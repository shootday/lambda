package com.study.cn.test;

import java.util.concurrent.Callable;

/**
 * @program: lambda
 * @Date: 2020/6/10 20:35
 * @Author: lzx
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("run.....");
            }
        };

        runnable.run();

        Runnable runnable2=() -> {
            System.out.println("run2....");
        };
        runnable2.run();


        Runnable runnable1=() -> System.out.println("run3...");

        runnable1.run();


        Callable c=new Callable() {
            @Override
            public Object call() throws Exception {
                return "dddd";
            }
        };
        System.out.println(c.call());


        Callable c1=() -> {return "ssss";};

        System.out.println(c1.call());


        Callable c2=()->"ddds";
        System.out.println(c2.call());
        System.out.println("nihaohahah");


    }



}
