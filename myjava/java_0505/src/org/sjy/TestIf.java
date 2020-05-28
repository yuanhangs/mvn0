package org.sjy;

import java.util.Scanner;

/**
 * @ClassName TestIf
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class TestIf {
    public static void main(String[] args){
//        张浩Java成绩大于90分，老师奖励他iPhone6s ，该怎么做呢？

        //输入对象
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入Java成绩：");
        int score=scanner.nextInt();

        //Java成绩大于90分
        if(score>90){
            System.out.println("老师奖励他iPhone6s");
        }


    }
}
