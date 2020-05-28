package org.lgx;

import java.util.Scanner;

/**
 * @autor: lgx
 * @date: 2020.05.05
 * @content: 键盘输入一个数并判断奇偶数
 */
public class Home_2 {
    public static void main(String[] args){
        //        提示
        System.out.print("请输入一个数：");
//        创建Scanner对象
        Scanner input=new Scanner(System.in);
//        键入
        int num=input.nextInt();
//        判断奇偶数
        if(num%2==0){
            System.out.println(num+"是偶数");
        }else{
            System.out.println(num+"是奇数");

        }
    }
}
