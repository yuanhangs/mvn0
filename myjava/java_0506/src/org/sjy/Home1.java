package org.sjy;

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
//从键盘输入两个数，并比较这两个数的大小，找出最大的数
        //输入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //保存最大值
        int max=0;

        //判断比较最大值
        if (a >= b) {
            max=a;
        }else {
            max=b;
        }
        System.out.print(max+"为最大值");
    }
}
