package org.sjy;

import java.util.Scanner;

/**
 * @ClassName TestIf
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class TestSwitch2 {
    public static void main(String[] args){

     //旅游计划
        //周一,西湖
        //周二,河坊街
        //周三,千岛湖

        //输入对象
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入周几：");
       String week=scanner.next();

        //分支语句结构
         switch (week){
             case "周一":
                 System.out.println("西湖");
                 break;
             case "周二":
                 System.out.println("河坊街");
                 break;
             case "周三":
                 System.out.println("千岛湖");
                 break;
             default:
                 System.out.println("other");
                 break;
         }


    }
}
