package com.study.cn.reflex;

import com.study.cn.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: lambda
 * @Date: 2020/7/14 8:02
 * @Author: lzx
 * @Description:
 */
public class ClassApi {

    public static void main(String[] args) throws  Exception{

        //获取成员变量  公共变量
        Class<?> aClass = Class.forName("com.study.cn.entity.Student");

        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());
            System.out.println("-------------");
        }

        System.out.println("++++++++++++");

        //获取成员变量  所有的修饰符
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {

            System.out.println(declaredField.getName());
        }

        System.out.println("++++++++++++");

        Field address = aClass.getDeclaredField("address");
        //属性可以访问
        address.setAccessible(true);
        System.out.println(address.getName());

        Object o = aClass.newInstance();
        address.set(o,"北京市");
        System.out.println(((Student) o).getAddress());

        System.out.println("++++++++++++");

        //普通方法 当前对象以及父类对象公共方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
            System.out.println(method.getModifiers());
            System.out.println("------method-------");
        }

        //普通方法 当前对象以及父类对象公共方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
            System.out.println(method.getName());
            System.out.println(method.getModifiers());
            System.out.println("------declaredMethods-------");
        }

        System.out.println("++++++++++++");

        Method add = aClass.getDeclaredMethod("add", int.class);
        add.setAccessible(true);
        Object o1 = aClass.newInstance();
        add.invoke(o1,123);

        System.out.println("++++++++++++");


        //获取对象的构造方法  public
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
            System.out.println(constructor.getName());
            System.out.println(constructor.getModifiers());
            System.out.println("------constructors-------");
        }

        //获取对象的构造方法
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
            System.out.println(constructor.getName());
            System.out.println(constructor.getModifiers());
            System.out.println("------declaredConstructors-------");
        }

        //调用私有的构造方法

        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Student object = (Student)declaredConstructor.newInstance("北京市");

        System.out.println(object);

    }
}
