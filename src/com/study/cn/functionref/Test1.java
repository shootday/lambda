package com.study.cn.functionref;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @program: lambda
 * @Date: 2020/6/11 20:44
 * @Author: lzx
 * @Description:
 */
public class Test1 {

    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> {
            return s.length();
        };
        System.out.println(f1.apply("daasdasdasd"));


        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("sssSASS");

        System.out.println("-------------------");
    }


}
