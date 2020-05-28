package org.lgx;
import java.util.Scanner;

/**
 * @autor: lgx
 * @date: 2020.05.05
 * @content: 判断平闰年及对应月份天数
 */
public class Home_3 {
    public static void main(String[] args){
        //        提示
        System.out.print("请输入年份：");
//        创建Scanner对象
        Scanner input=new Scanner(System.in);
//        键入年份
        int years=input.nextInt();

//        判断平闰年
        //能被4整除并且不能被100整除或能被400整除的数,
        if(years%4==0&&years%100!=0 || years%400==0){
            System.out.println(years+"是闰年");

//          提示输入月份
            System.out.print("请输入月份：");
            //        键入月份
            int months=input.nextInt();
//            判断月份天数并打印输出
            switch(months){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(months+"是31天");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(months+"是30天");
                    break;
                case 2:
                    System.out.println(months+"是29天");
                    break;
                default:
                    System.out.println("请输入正确的月份");
                    break;
            }

        }
        else{
            System.out.println(years+"是平年");
        }
    }
}
