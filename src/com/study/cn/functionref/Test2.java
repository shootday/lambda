package com.study.cn.functionref;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @program: lambda
 * @Date: 2020/6/11 20:46
 * @Author: lzx
 * @Description:  ::方法引用
 *
 *
 * 静态方法的引用 类名::静态方法名
 */
public class Test2 {

    static String put() {
        System.out.println("put....");
        return "put";
    }

    static void get(int sieze) {
        System.out.println("put...." + sieze);
    }

    static String toUpperCasem(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        //   System.out.println(put());

        Supplier<String> s1 = () -> put();
        System.out.println(s1.get());

        Supplier<String> s2 = Test2::put;
        System.out.println(s2.get());

        Supplier<String> s3 = Fun::hhe;

        System.out.println(s3);

        Consumer<Integer> consumer = Test2::get;
        consumer.accept(33);

        Consumer<Integer> consumer1 = integer -> get(integer);
        consumer1.accept(7777);


        Function<String, String> fun1 = s -> Test2.toUpperCasem(s);

        Function<String, String> fun2 = Test2::toUpperCasem;

        Function<String, String> fun3 = Fun::toUpperCasew;

        System.out.println(fun3.apply("abc"));
    }
}


class Fun{
    public  static  String hhe(){
        return  "heh ";
    }

    static String toUpperCasew(String str) {
        return str.toUpperCase();
    }

}


