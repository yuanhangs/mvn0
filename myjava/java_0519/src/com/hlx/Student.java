package com.hlx;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/19
 * @Version V1.0
 **/
public class Student {
    //属性
    String name;
    int age;
    double height;
    double weight;
    String sex;


    //方法
    public void show(){
        System.out.println(name+"\t"+age+"" +
                "\t"+height+"\t"+weight+"\t"+sex);
    }
}
