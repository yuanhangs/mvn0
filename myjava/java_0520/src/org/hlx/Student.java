package org.hlx;

import java.util.NavigableMap;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class Student {
    //属性
    String name;
    String sex;

    //年龄
    public int age;


    //无返回值，那么就自己打印
    public void show(){
        System.out.println(name+"\t"+sex);
    }

    //有返回值，那么调用者打印
    public String getName(){
        return name;
    }

    /**
     *  不同的类，那么必须先创建对象，再调用方法；
     * 邀请老虎来做客
     */
    public void display(){
      //创建老虎对象
        Tiger tiger =new Tiger();
        tiger.show();
        System.out.println("到"+name+"做客!");
    }

    /**
     * 同一个类，直接调用方法
     */
    public void my(){
        show();
    }

}
