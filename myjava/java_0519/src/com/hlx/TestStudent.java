package com.hlx;

/**
 * @ClassName TestStudent
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/19
 * @Version V1.0
 **/
public class TestStudent {
    public static void main(String[] args) {
        //zzk 创建对象
        Student zzk=new Student();

        //给属性赋值
        zzk.name="ZZK";
        zzk.age=18;
        zzk.height=175;
        zzk.weight=60;

        //调用方法
        zzk.show();


        //1>创建对象
        Student yw=new Student();
        //2>赋值
        yw.name="余伟";
        yw.age=20;
        yw.height=172;
        yw.weight=60;
        yw.sex="男";

        //3>调用方法;
        yw.show();
    }
}
