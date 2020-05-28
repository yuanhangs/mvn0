package org.two;

import org.hlx.Student;

/**
 * @ClassName TestNumber
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class TestNumber {

    public static void main(String[] args) {
         Numbers number=new Numbers();
         int num=10;
         //调用方法（参数：基本类型，用副本，值不发生变化）
         number.calc1(num);
         //原来的副本；
         System.out.println("num==>"+num);


        Student stu=new Student();
        stu.age=10;
        //调用方法应（参数：引用类型(类,数组)，用地址，值会发生变化）
        number.calc2(stu);
        //
        System.out.println( "age==>"+stu.age);

    }
}
