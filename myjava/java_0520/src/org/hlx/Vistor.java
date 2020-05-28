package org.hlx;

import java.util.Scanner;

/**
 * @ClassName Vistor
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class Vistor {
    //属性
    String name;
    int age;

    //方法
    public void show(){
        if(age>=10) {
            System.out.println(name + "的年龄为：" + age + ", 门票价格：是20元");
        }else{
            System.out.println(name + "的年龄为：" + age + ", 门票价格：免费");
        }
    }


    //方法
    public void display(){
        //键盘输入对象
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.print("请输入姓名：");
            name=scanner.next();
            //判断退出程序
            if("n".equalsIgnoreCase(name)){
                System.out.println("退出程序!");
                break;  //退出循环
            }
            System.out.print("请输入年龄：");
            age=scanner.nextInt();
            //判断年龄>=10门票是20元
            if (age >= 10) {
                System.out.println(name + "的年龄为：" + age + ", 门票价格：是20元");
            } else {
                System.out.println(name + "的年龄为：" + age + ", 门票价格：免费");
            }

        }while(true);
    }
}
