package org.lgx;

import java.util.Scanner;

/**
 * @autor: lgx
 * @date: 2020.05.05
 * @content: 键盘输入成绩并判断是否合格
 */
public class Home_1 {
    public static void main(String[] args) {
//        提示
        System.out.print("请输入成绩：");
//        创建Scanner对象
        Scanner input = new Scanner(System.in);
//        键入
        int score = input.nextInt();

        do {
//        判断成绩是否合法
            if (score >= 0 && score <= 100) {
//            判断成绩是否合格
                if (score >= 60) {
                    System.out.println("成绩合格");
                } else {
                    System.out.println("成绩不合格");
                }
                break;
            } else {
//            成绩不合法，提示重新录入
            System.out.println("请输入正确成绩：");
            score=input.nextInt();

            }

        } while (true);
    }
}
