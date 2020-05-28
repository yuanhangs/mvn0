package org.jwj2;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //创建Scanner
        Scanner scanner = new Scanner(System.in);
        //友好提示
        System.out.print("输入一个整数（输入0时结束）：");
        //键入
        int num = scanner.nextInt();
        System.out.println();
        //最大值
        int max = num;
        //最小值
        int min = num;
        //设置钥匙
        boolean key = false;
        if(num == 0){
            key = true;
        }
        //设置变量
        int num1;
        if(key == false){
            //do-while循环
            do{
                //友好提示
                System.out.print("输入一个整数（输入0时结束）：");
                //键入
                num1 = scanner.nextInt();
                System.out.println();
                //if比较
                if(num1 >= max){
                    max = num1;
                }else if (num1 <= min){
                        min = num1;
                }

            }while(num1 != 0);
        }
        //输出
        System.out.println("最大值："+max+"\t\t"+"最小值："+min);
    }
}
