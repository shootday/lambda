package com.study.cn.whylamdba.why2;

import com.study.cn.lambda.Student;

import java.util.ArrayList;

/**
 * @program: java_review_jdk12
 * @Date: 2020/6/10 17:12
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
        getByFilter(list,new AgeFilter());

        System.out.println("-------------");
        //查找分数大于75分的学生

        getByFilter(list,new ScoreFilter());
    }

    public static void getByFilter(ArrayList<Student> students, StudentFilter studentFilter) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (studentFilter.compare(student)) {
                list.add(student);
            }
        }
        printStudent(list);
    }

    public static void printStudent(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
