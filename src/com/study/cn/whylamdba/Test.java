package com.study.cn.whylamdba;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: java_review_jdk12
 * @Date: 2020/6/10 16:48
 * @Author: lzx
 * @Description:
 */
public class Test {


    public static void main(String[] args) {
//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(111111);
//            }
//        });
//
//        thread.start();
//
//
//
//        new Thread(() -> {
//            System.out.println("lam....");
//        }).start();


        List<String> list = Arrays.asList("java", "javascript", "scala", "python");
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
//        for (String s : list) {
//            System.out.println(s);
//        }

        Collections.sort(list, (a, b) ->
                a.length() - b.length()
        );
        list.forEach(System.out::println);



    }
}
