package org.hlx;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName TestTwoArray
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/13
 * @Version V1.0
 **/
public class TestTwoArray {

      //psvm
    public static void main(String[] args) {

       // one();

        // 有5个班各5名学生某门课程的成绩，如何计算5个班各自的总成绩

        //键盘输入对象
        Scanner scanner = new Scanner(System.in);

        //声明二维数组
        int[][]  scores =new int[5][5];
        //Exception in thread "main" java.lang.NullPointerException

        //循环班级--行
        for (int i = 0; i <scores.length ; i++) {
            System.out.println("第"+(i+1)+"个班级");

          //存放的数据--列////
            //累计和
            int sum=0;
            System.out.println("请输入5名学生的成绩:");
            for (int j = 0; j <scores[i].length ; j++) {
                //存入数组
                scores[i][j]=scanner.nextInt();
                //累计和
                sum+=scores[i][j];
            }
            System.out.println("sum="+sum);
           ///////////////////////////
        }


        //输出每个班级的成绩
        for (int i = 0; i <scores.length ; i++) {
            System.out.println(Arrays.toString(scores[i]));
        }


    }

    //        有1个班各5名学生某门课程的成绩，如何计算1个班各自的总成绩
    private static void one() {
        //键盘输入对象
        Scanner scanner = new Scanner(System.in);

        //声明数组：存放成绩；
        int[] scores =new int[5];

        //累计和
        int sum=0;
        System.out.println("请输入5名学生的成绩:");
        for (int i = 0; i <scores.length ; i++) {
            //存入数组
            scores[i]=scanner.nextInt();
            //累计和
            sum+=scores[i];
        }
        System.out.println("sum="+sum);
    }


}
