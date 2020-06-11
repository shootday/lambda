package com.study.cn.whylamdba.why2;


import com.study.cn.lambda.Student;

/**
 * @program: java_review_jdk12
 * @Date: 2020/6/10 17:10
 * @Author: lzx
 * @Description:
 */
public interface StudentFilter {

    boolean compare(Student student);
}
