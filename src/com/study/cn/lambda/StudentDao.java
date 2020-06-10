package com.study.cn.lambda;

/**
 * @program: lambda
 * @Date: 2020/6/10 20:45
 * @Author: lzx
 * @Description:
 */

@FunctionalInterface
public interface StudentDao {

    void  insert(Student student);
}
