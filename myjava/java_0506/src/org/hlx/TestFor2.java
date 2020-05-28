package org.hlx;

import java.util.Scanner;

/**
 * @ClassName TestFor2
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/6
 * @Version V1.0
 **/
public class TestFor2 {

    public static void main(String[] args) {
//        循环输入某同学S1结业考试的5门课成绩，并计算平均分

        Scanner scanner =new Scanner(System.in);
        System.out.print("输入学生姓名：");
        String name = scanner.next();

        //总分
        int sum =0;

        //循环5门课
        for (int i = 0; i <5; i++) {
            System.out.print("输入5门课中第"+(i+1)+"门成绩：");
            int score = scanner.nextInt();

            //累计和   ==>sum=sum+score
            sum+=score;
        }
        System.out.println(name+"的5门课平均分："+sum/(double)5);

    }
}
