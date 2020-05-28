package org.lgx;

import java.util.Scanner;

/**
 * @autor: lgx
 * @date: 2020.05.05
 * @content: 从键盘输入两个数，并判断最大数
 */
public class Home_4 {
    public static void main(String[] args) {
//        提示
        System.out.print("请输入第一个数：");
//        创建Scanner对象
        Scanner input = new Scanner(System.in);
//        键入
        int num1 = input.nextInt();
        System.out.print("请输入第二个数：");
        int num2 = input.nextInt();

        int max =0;
//      判断最大值，并打印输出
        if(num1>num2){
           max =num1;
        }else {
           max=num2;
        }

        System.out.println("最大值"+max);
    }
}
