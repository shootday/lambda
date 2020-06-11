package com.study.cn.functionref;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @program: lambda
 * @Date: 2020/6/11 21:19
 * @Author: lzx
 * @Description: ::方法引用
 *
 * 实例方法的引用 实例名(new object())::方法名
 */
public class Test3 {

    public  String  put(){
        return  "put..";
    }

    public  void  get(int size){
        System.out.println(size);
    }


    public static void main(String[] args) {
        System.out.println(new Test3().put());

        Test3 test3=new Test3();


        Supplier<String>supplier=()->new Test3().put();
        System.out.println(supplier.get());

        Supplier<String> supplier1=()-> {return  new Test3().put();};
        System.out.println(supplier1.get());

        Supplier<String> supplier2=new Test3()::put;
        System.out.println(supplier2.get());

        Consumer<Integer>consumer=size->new Test3().get(size);

        Consumer<Integer>consumer1=new Test3()::get;

        Consumer<Integer>consumer2=test3::get;
    }
}
