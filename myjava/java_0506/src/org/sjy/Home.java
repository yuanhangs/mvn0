package org.sjy;

import java.util.Scanner;

public class  Home {
    public static void main(String[] args) {
//1.从键盘输入学生的分数来判断学生STB成绩是否不小于60分,就输出"及格" 否则输出"不及格"
        //输入对象
        Scanner scanner = new Scanner(System.in);
        System.out.print("学生STB成绩是：");
        int score = scanner.nextInt();
        //成绩是否不小于60分,就输出"及格"
        if (score >= 60) {
            System.out.println("及格");

        } else {
            System.out.println("不及格6");
        }
    }

}
