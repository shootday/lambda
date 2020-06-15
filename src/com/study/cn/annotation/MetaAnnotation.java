package com.study.cn.annotation;

import java.lang.annotation.*;

/**
 * @program: lambda
 * @Date: 2020/6/15 15:46
 * @Author: lzx
 * @Description:
 * @Target 当前自定义注解使用的地方  类  方法 变量  包。。
 * @Retention 当前的自定义注解适用于什么环境（注解的生命周期） 源码 <类 <运行时环境  一般运行时环境
 * @Documented 表示该注解是否显示在javadoc中
 * @Inherited 是否能被继承
 */

//@Meta(name = "hhe",age = 15,id=3,likes = {"book","fksd"})
@Meta
public class MetaAnnotation {


    public void test() {

    }

}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface Meta {

    //定义的时候看起来像是方法，
    // 实际上是 在使用注解的时候填写的参数名称
    //默认的名称是value
    //所有的方法都需要在使用注解的时候添加值，很麻烦，因此包含默认值

    String name() default "张三";

    int age() default 12;

    int id() default 1;

    String[] likes() default {"a", "b", "c"};


}
