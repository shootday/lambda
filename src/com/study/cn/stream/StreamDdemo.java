package com.study.cn.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @program: lambda
 * @Date: 2020/6/12 15:16
 * @Author: lzx
 * @Description:
 */
public class StreamDdemo {


    //通过数组来生成

    static void get1() {
        String[] str = {"a", "b", "c", "d", "e"};
        Stream<String> stream = Stream.of(str);
        stream.forEach(System.out::println);
    }

    //通过集合来生成

    static void get2() {
        List<String> lsit = Arrays.asList("a", "b", "c", "d", "e");
        Stream<String> stream = lsit.stream();
        stream.forEach(System.out::println);
    }


    //generate
    static void get3() {

        //Stream<Integer> generate = Stream.generate(() -> 1);
        //generate.limit(10).forEach(System.out::println);
        Stream<Integer> generate = Stream.generate(() -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(i);
            }
            return i;
        });
        generate.limit(1).forEach(System.out::println);
    }


    //iterator  循环迭代
    static void get4() {

        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
        iterate.limit(100).forEach(System.out::println);
    }


    //其它方式
    static void get5() {
        String str = "abcdefg";
        IntStream chars = str.chars();
        chars.limit(100).forEach(System.out::println);
    }


    public static void main(String[] args) {

        //stream生成操作
        // get1();

        //  get2();

        //  get3();

        // get4();

        // get5();

        //中间操作  如果调用方法之后返回结果是stream对象就意味着是一个中间操作

        //filter 过滤
        //取出偶数
//        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().filter(x ->
//                x % 2 == 0
//        ).forEach(System.out::println);

        //偶数和
//        int sum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().filter(
//                x -> x % 2 == 0
//        ).mapToInt(value -> value).sum();
//
//        System.out.println(sum);


        //集合最大值
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//
//        Optional<Integer> max = list.stream().max((o1, o2) ->
//                o1 - o2
//        );
//        System.out.println(max.get());
//
//        //集合最小值
//        Optional<Integer> min = list.stream().min((o1, o2) ->
//                o1 - o2
//        );
//        System.out.println(min.get());
//

//        Optional<Integer> any = list.stream().filter(x -> x % 2 == 0).findAny();
//        System.out.println(any.get());

//        Optional<Integer> first = list.stream().filter(x -> x % 10 == 7).findFirst();
//        System.out.println(first.get());

//        Stream<Integer> stream = list.stream().filter(x -> {
//            System.out.println("代码不会运行");
//            return x % 2 == 0;
//
//        });
//
//        System.out.println(stream);
//
//        System.out.println(stream.findFirst().get());
//

        //获取最大值最小值不使用max  min
        //sorted自然顺序排序

        //最小值
//        Optional<Integer> min = list.stream().sorted().findFirst();
//        System.out.println(min.get());
//
//        //最大值
//        Optional<Integer> max = list.stream().sorted((o1, o2) -> o2-o1).findFirst();
//        System.out.println(max.get());


        List<String> list1 = Arrays.asList("achsseg", "java", "c#", "python", "scala", "jeav");
        // 按字典排序
//        list1.stream().sorted().forEach(System.out::println);

        //按字符长度排序
        // list1.stream().sorted((o1, o2) -> o1.length() - o2.length()).forEach(System.out::println);

        //集合元素过滤同时返回一个集合对象
//        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        collect.forEach(System.out::println);


        //去重

        List<Integer> list2 = Arrays.asList(1, 2, 3, 5, 4, 1, 2, 6, 5, 8, 4, 3);
        //list2.stream().distinct().forEach(System.out::println);

        // list2.stream().collect(Collectors.toSet()).forEach(System.out::println);


        //打印20-30这样的集合数据
        //limit 次数   skip跳过    相当于执行x+1  50次跳过20次执行10 打印
        //  Stream.iterate(1, x -> x + 1).limit(50).skip(20).limit(10).forEach(System.out::println);


        //求和
        String str = "11,22,33,44,55";
        // System.out.println(Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum());

        // System.out.println(Stream.of(str.split(",")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());

        // System.out.println(Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum());

        // System.out.println(Stream.of(str.split(",")).map(Integer::valueOf).mapToInt(x -> x).sum());

        //创建一组自定义对象

        String p = "java,scala,python";

        //  Stream.of(p.split(",")).map(x -> new Persion(x)).forEach(System.out::println);
        // List<Persion> collect = Stream.of(p.split(",")).map(x -> new Persion(x)).collect(Collectors.toList());

        // Stream.of(p.split(",")).map(Persion::new).forEach(System.out::println);

       // Stream.of(p.split(",")).map(x -> new Persion(x)).forEach(System.out::println);
       // Stream.of(p.split(",")).map(Persion::bulid).forEach(System.out::println);


        String str1 = "11,22,33,44,55";
        //将string中的每一个数值打印并且求和
       // System.out.println(Stream.of(str1.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum());


       // System.out.println(list2.stream().allMatch(x -> x >= 0));



    }

}
