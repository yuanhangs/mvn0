package org.hlx;

import java.util.Scanner;

/**
 * @ClassName TestFor2
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/6
 * @Version V1.0
 **/
public class TestFor3 {

    public static void main(String[] args) {
//     0+8=8
//     1+7=8
//     2+6=8

        Scanner scanner =new Scanner(System.in);
        System.out.print("输入一个值：");
        int number = scanner.nextInt();

        System.out.println("根据如下打印加法值：");
        //循环 初始化值可以是多个，用“，”隔开；
        for (int i = 0,j=number; i <number ; i++,j--) {
            System.out.println(i+"+"+j+"="+number);
        }


    }
}
