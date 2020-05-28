package org.lgx;

import java.util.Scanner;

/**
 * @autor: lgx
 * @date: 2020.05.05
 * @content:  根据手机尾号，输出号码的价格
 */
public class Home_9 {
    public static void main(String[] args) {
        //        提示
        System.out.print(" 请输入你想要的手机号的尾号（最后一位0-9）:");
//        创建Scanner对象
        Scanner input = new Scanner(System.in);
//        键入手机尾号
        int num = input.nextInt();
//        根据手机尾号判断手机号价格
        switch(num){
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println("（0，1，2，3，5，7）是50元一个！");
                break;
            case 4:
                System.out.println("(4)是50元一个！");
                break;
            case 6:
            case 8:
                System.out.println("（6 ，8 ） 是150元一个！");
                break;
            case 9:
                System.out.println("(9)是80元一个！");
                break;
            default:
                System.out.println("输入错误！");
                break;
        }
    }
}
