package org.lgx;

import java.util.Scanner;

/**
 * @autor: lgx
 * @date: 2020.05.05
 * @content: 从键盘输入三个边长，判断输入的边长能否组成三角形，能组成什么样的三角形
 */
public class Home_7 {
    public static void main(String[] args) {
        //        创建Scanner对象
        Scanner input = new Scanner(System.in);


//        提示
        System.out.print("请输入第一个边长：");
//        键入
        int a = input.nextInt();
        System.out.print("请输入第二个边长：");
        int b = input.nextInt();
        System.out.print("请输入第三个边长：");
        int c = input.nextInt();
//        布尔型变量，判断三角形，true构成三角形，false不能构成三角形
        boolean isTriangle = (a + b > c) && (Math.abs(a - b) < c);
//      先判断能否构成三角形，再判断等腰三角形，再判断等边三角形，再判断直角三角形
        if (isTriangle) {
            if (a == b || a == c || b == c) {
                if (a == b && b == c) {
                    System.out.println("它等边三角形");
                } else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                    System.out.println("它是等腰直角三角形");
                } else {
                    System.out.println("它是等腰三角形");
                }
            } else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                System.out.println("它是直三角形");
            } else {
                System.out.println("它是其它三角形");
            }
        } else {
            System.out.println("不能构成三角形");
        }
    }

}
