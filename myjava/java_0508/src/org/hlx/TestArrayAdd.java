package org.hlx;

import java.util.Scanner;

/**
 * @ClassName TestArray2
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class TestArrayAdd {

    public static void main(String[] args) {
//        有一组学员的成绩{99，85，82，63， 60}，将它们按降序排列。要增加一个学员的成绩，将它插入成绩序列，并保持降序

        //1.声明数组初始化(添加一个成绩)
        int[] scores ={99,85,82,63,60,0};

        System.out.println("原来的数据：");
        //循环数组
        for (int i = 0; i <scores.length ; i++) {
            System.out.print(scores[i]+"\t");
        }

        System.out.println();

        //2.键盘输入对象
        Scanner scanner =new Scanner(System.in);
        System.out.print("输入新增的成绩：");
        int score=scanner.nextInt();

        //3.查找添加成绩的位置65
        int flag=0;
        for (int i = 0; i <scores.length ; i++) {
            //判断
            if(score>scores[i]){
                //记录下标
                flag= i;
                break; //停止循环
            }
        }
        System.out.println("flag==>>"+flag);

        //4.交换数据位置  63,60 ,0
        for (int i = scores.length-1; i>flag ; i--) {
           //交换
            scores[i]=scores[i-1];
        }

        //5.添加
        scores[flag]=score;

        System.out.println("添加的数据：");
        //循环数组
        for (int i = 0; i <scores.length ; i++) {
            System.out.print(scores[i]+"\t");
        }

    }
}
