package com.study.cn.whylamdba.why;

import com.study.cn.lambda.Student;

import java.util.ArrayList;

/**
 * @program: java_review_jdk12
 * @Date: 2020/6/10 17:02
 * @Author: lzx
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("zhangsan", 14, 65));
        list.add(new Student("lisi", 50, 100));
        list.add(new Student("wangwu", 20, 0));
        list.add(new Student("liuliu", 66, 32));
        list.add(new Student("qisan", 11, 52));
        list.add(new Student("bayi", 89, 77));

        //查找年龄大于14的学生
        //查找分数大于75分的学生
        findByAge(list);
        System.out.println("---------------");
        findByScoore(list);
    }


    public static void findByAge(ArrayList<Student> list) {
        ArrayList<Student> list1 = new ArrayList<>();
        for (Student student : list) {
            if (student.getAge() > 14) {
                list1.add(student);
            }
        }

        for (Student student : list1) {
            System.out.println(student);
        }

    }

    public static void findByScoore(ArrayList<Student> list) {
        ArrayList<Student> list1 = new ArrayList<>();
        for (Student student : list) {
            if (student.getScore() > 75) {
                list1.add(student);
            }
        }
        for (Student student : list1) {
            System.out.println(student);
        }

    }
}
