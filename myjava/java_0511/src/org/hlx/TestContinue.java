package org.hlx;

import java.sql.Connection;
import java.util.Scanner;

/**
 * @ClassName TestBreak
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/11
 * @Version V1.0
 **/
public class TestContinue {

    public static void main(String[] args) {
//        循环录入Java课的学生成绩，统计分数大于等于80分的学生比例
        //1.键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //友好提示
        System.out.print("输入总人数：");
        int  number = scanner.nextInt();

        //统计个数
        int count =0;

        //循环输入成绩
        for (int i = 0; i <number; i++){
            //友好提示
            System.out.print("输入第"+(i+1)+"门课的成绩：");
            int score = scanner.nextInt();

            //判断
            if(score<80) {
                continue;
            }
            //统计个数
            count++;

        }
        System.out.println("分数大于等于80分的学生个数："+ count);
        System.out.println("分数大于等于80分的学生比例："+ (int)(count/(double)number*100)+"%");

    }
}
