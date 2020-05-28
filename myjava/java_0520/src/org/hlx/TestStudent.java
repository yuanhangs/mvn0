package org.hlx;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @ClassName TestStudent
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class TestStudent {

    public static void main(String[] args) {
        //1.创建对象
        Student student =new Student();
        //2.给属性赋值
        student.name="john";
        student.sex="Man";

        //3.调用show方法
       // student.show();

        //调用getName方法
        String string= student.getName();
        System.out.println(string);
     //   System.out.println(student.getName());

        //
        student.display();

        student.my();
    }
}
