package com.study.cn.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @program: lambda
 * @Date: 2020/6/15 16:13
 * @Author: lzx
 * @Description:
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyField {

    String description();

    int length();
}

class Test {


    //使用我们的自定义注解
    @MyField(description = "用户名", length = 12)
    private String username;

    public void testMyField() {

        // 获取类模板
        Class c = Test.class;

        // 获取所有字段
        for (Field f : c.getDeclaredFields()) {
            // 判断这个字段是否有MyField注解
            if (f.isAnnotationPresent(MyField.class)) {
                MyField annotation = f.getAnnotation(MyField.class);
                System.out.println("字段:[" + f.getName() + "], 描述:[" + annotation.description() + "], 长度:[" + annotation.length() + "]");
            }
        }

    }

    public static void main(String[] args) {
        new Test().testMyField();
    }
}
