package com.study.cn.functionref;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @program: lambda
 * @Date: 2020/6/11 22:29
 * @Author: lzx
 * @Description:
 */
public class Test5 {

    public static void main(String[] args) {
        Supplier<Person> p=() -> new Person();

        p.get();


        Supplier<Person> p1=Person::new;

        p1.get();


        Supplier<List> list= ArrayList::new;

        Supplier<Set> set= HashSet::new;


        Supplier<Thread> t= Thread::new;


        Supplier<String> str= String::new;

       // Supplier<Integer> t= Integer::new;  Integer必须有参数


        Consumer<Integer> c1=Integer::new;

        Consumer<Integer> c2=age->new Account(age);

        Consumer<Integer> account=Account::new;
    }


}


class  Person{

    public  Person(){
        System.out.println("无参数..p.");
    }
}

class  Account{

    public  Account(){
        System.out.println("无参数...");
    }

    public  Account(int age){
        System.out.println("age...."+age);
    }
}
