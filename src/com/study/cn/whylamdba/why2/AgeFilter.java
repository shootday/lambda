package com.study.cn.whylamdba.why2;


import com.study.cn.lambda.Student;

/**
 * @program: java_review_jdk12
 * @Date: 2020/6/10 17:11
 * @Author: lzx
 * @Description:
 */
public class AgeFilter implements StudentFilter {

    @Override
    public boolean compare(Student student) {
        return student.getAge() > 14;
    }
}
