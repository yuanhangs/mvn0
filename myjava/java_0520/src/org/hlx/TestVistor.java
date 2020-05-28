package org.hlx;

import java.util.Scanner;

/**
 * @ClassName TestVistor
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class TestVistor {
    public static void main(String[] args) {
//        show();

        //1.创建对象
        Vistor vistor =new Vistor();
        //3.调用方法
        vistor.display();

    }

    private static void show() {
        //键盘输入对象
        Scanner scanner =new Scanner(System.in);

        //1.创建对象
        Vistor vistor =new Vistor();

        //2.给属性赋值
        System.out.print("请输入姓名：");
        vistor.name=scanner.next();
        System.out.print("请输入年龄：");
        vistor.age=scanner.nextInt();

        //3.调用方法
        vistor.show();
    }
}
