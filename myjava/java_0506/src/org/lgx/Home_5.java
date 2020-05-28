package org.lgx;

import java.util.Scanner;

/**
 * @autor: lgx
 * @date: 2020.05.05
 * @content: 从键盘输入三个数,并比较三个数的大小，找出最大的数
 */
public class Home_5 {
    public static void main(String[] args) {
//        提示
        System.out.print("请输入第一个数：");
//        创建Scanner对象
        Scanner input = new Scanner(System.in);
//        键入
        int num1 = input.nextInt();
        System.out.print("请输入第二个数：");
        int num2 = input.nextInt();
        System.out.print("请输入第三个数：");
        int num3 = input.nextInt();
//      先判断num1与num2，若num1大，再与num3比较判断最大值，若num2大，再与num3比较，并打印输出
        if(num1>num2) {
            if (num1 > num3) {
                System.out.println("最大值是" + num1);
            } else {
                System.out.println("最大值是" + num3);
            }
        }else{
            if (num2 > num3) {
                System.out.println("最大值是" + num2);
            } else {
                System.out.println("最大值是" + num3);
            }
        }
    }

}
