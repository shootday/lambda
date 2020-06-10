package com.study.cn.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @program: lambda
 * @Date: 2020/6/10 20:53
 * @Author: lzx
 * @Description:
 */
public class TecherTest {

    public static void main(String[] args) {

//        TeacherDao teacherDao  =new TeacherDao() {
//            @Override
//            public int get(Teacher teacher) {
//                return 0;
//            }
//        };
//
//        System.out.println(teacherDao.get(new Teacher()));
//
//
//        TeacherDao teacherDao2 =(teacher) -> {return 1;};
//        System.out.println(teacherDao2.get(new Teacher()));
//
//        TeacherDao teacherDao3 =(teacher) -> 2;
//        System.out.println(teacherDao3.get(new Teacher()));
//
//        TeacherDao teacherDao4 =(Teacher teacher) -> 3;
//        System.out.println(teacherDao4.get(new Teacher()));
//
//        TeacherDao teacherDao5 =(Teacher teacher) -> {return 4;};
//        System.out.println(teacherDao5.get(new Teacher()));
//

        /**
         * java中的一系列函数式接口
         */

        //输入类型是string  返回类型是integer
//        Function<String, Integer> f1 = s -> {
//            return s.length();
//        };
//        System.out.println(f1.apply("daasdasdasd"));
//
//        //只有输出
//        Supplier<String> supplier1=new Supplier<String>() {
//            @Override
//            public String get() {
//                return null;
//            }
//        };
//        Supplier<String> supplier = () -> "ddddsad";
//        System.out.println(supplier.get());
//
//
//        Consumer<String> consumer = s -> System.out.println(s);
//        consumer.accept("sssSASS");
//
//        System.out.println("-------------------");
//
////两个输入参数一个输出参数。
//        BiFunction<String, String, Integer> ll = (s, s2) -> 100;
//        System.out.println(ll.apply("aa", "b"));
//
//        Runnable runnable = () -> System.out.println(get());
//
//        runnable.run();
//
//        System.out.println("-------------------");
//
//
//        Runnable runnable1 = () -> System.out.println(excc());
//
//        runnable1.run();
//
//        LambdaInterface ld = () -> get();
//        System.out.println(ld.get());
//
//        LambdaInterface ld1 = () -> 100;
//        System.out.println(ld1.get());


        List<String>list = Arrays.asList("a","b","c");
//        for (String s : list) {
//            System.out.println(s);
//        }

        list.forEach(System.out::println);


    }

    static int get() {
        return 1;
    }

    static String find() {
        return "find";
    }

    static String excc() {
        return find();
    }
}
