package org.hlx;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @ClassName TestBreak
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/11
 * @Version V1.0
 **/
public class TestBreak {

    public static void main(String[] args) {
//        循环录入某学生5门课的成绩并计算平均分，如果某分数录入为负，停止录入并提示录入错误
        //1.键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //友好提示
        System.out.print("输入学生姓名：");
        String name = scanner.next();

        //总分
        int sum =0;

        //标记是负数
        boolean flag=false;

        //循环输入成绩
        for (int i = 0; i <5; i++){
            //友好提示
            System.out.print("输入第"+(i+1)+"门课的成绩：");
            int score = scanner.nextInt();

           // 如果某分数lu，停止录入
            if(score>=0) {
                //累加和
                sum += score;
            }else{
                System.out.println("抱歉，分数录入是负数，停止！");
                flag=true;  //
                break;
            }
        }
        if(!flag)
          System.out.println("5门课的成绩并计算平均分:"+sum/5.0);

    }
}
