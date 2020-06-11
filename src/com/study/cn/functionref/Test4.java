package com.study.cn.functionref;

import java.util.function.Consumer;

/**
 * @program: lambda
 * @Date: 2020/6/11 22:06
 * @Author: lzx
 * @Description:
 *
 * 对象方法的引用
 */
public class Test4 {


    public static void main(String[] args) {

        Consumer<Too>c1=(Too too)->new Too().foo();

        c1.accept(new Too());



        Consumer<Too> consumer=(Too too) -> new Two().foo();
        consumer.accept(new Too());

        Consumer<Too> consumer2=Too::foo;
        consumer2.accept(new Too());

        Consumer<Too> consumer3=Too::foo;
        consumer3.accept(new Too());


    }
}


class Too {


    public Integer fun() {
        return 1;
    }


    public void foo() {
        System.out.println("foo");
    }


}


class Two {


    public Integer fun(String s) {
        return 2;
    }


    public void foo() {
        System.out.println("Two");
    }


    public void show(String str){

    }


}
