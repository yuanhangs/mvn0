package org.sjy;

import java.util.Scanner;

/**
 * @ClassName TestIf
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class TestSwitch {
    public static void main(String[] args){

//        韩嫣参加计算机编程大赛
//        如果第一名，参加麻省理工大学组织的1个月夏令营
//        如果第二名，奖励惠普笔记本电脑一部
//        如果第三名，奖励移动硬盘一个
//        否则，不给任何奖励

        //输入对象
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入名次：");
        int num=scanner.nextInt();

        //分支语句结构
         switch (num){
             case 1:
                 System.out.println("参加麻省理工大学组织的1个月夏令营");
                 break;
             case 2:
                 System.out.println("奖励惠普笔记本电脑一部");
                 break;
             case 3:
                 System.out.println("奖励移动硬盘一个");
                 break;
             default:
                 System.out.println("不给任何奖励");
                 break;
         }

//        switch (num){
//            case 3:
//                System.out.println("奖励移动硬盘一个");
////                break;   //退出switch;
//            default:
//                System.out.println("不给任何奖励");
////                break;
//            case 1:
//                System.out.println("参加麻省理工大学组织的1个月夏令营");
//                break;
//            case 2:
//                System.out.println("奖励惠普笔记本电脑一部");
//                break;
//
//        }



    }
}
