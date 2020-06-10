package com.study.cn.lambda;

/**
 * @program: lambda
 * @Date: 2020/6/10 20:53
 * @Author: lzx
 * @Description:
 */
public class StudentTest {

    public static void main(String[] args) {

        StudentDao studentDao=new StudentDao() {
            @Override
            public void insert(Student student) {
                System.out.println("1111");
            }
        };

        studentDao.insert(new Student());

        StudentDao studentDao1=(student) -> {
            System.out.println("2222"+student);
        };

        studentDao1.insert(new Student());

        StudentDao studentDao2=student -> {
            System.out.println("3333"+student);
        };

        studentDao2.insert(new Student());


        StudentDao studentDao3=(Student student) -> {
            System.out.println("4444"+student);
        };

        studentDao3.insert(new Student());

    }
}
