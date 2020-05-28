package org.sjy;

import java.util.Scanner;

public class Home3 {
    public static void main(String[] args) {
        //用if嵌套：从键盘输入三个数,并比较三个数的大小，找出最大的数
        //输入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入三个数");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //if嵌套
        if (a > b ) {
            if (a>c){
                System.out.println(a+"为最大值");
            }else {
                System.out.println(c+"为最大值");
            }

        }else {
            if (b>c){
                System.out.println(b+"为最大值");
            }else {
                System.out.println(c+"为最大值");
            }
        }
    }
}
