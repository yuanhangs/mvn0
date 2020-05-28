package org.sjy;

import java.util.Scanner;

/**
 * @ClassName TestIf
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class TestIf2 {
    public static void main(String[] args){
//   张浩Java成绩大于90分，并且音乐成绩大于80分时，或者Java成绩等于100分，音乐成绩大于70分时，老师奖励他iPhone6s ，该怎么做呢？

        //输入对象
        Scanner scanner =new Scanner(System.in);
        System.out.print("输入Java成绩：");
        int scoreJava=scanner.nextInt();
        System.out.print("输入Music成绩:");
        int scoreMusic=scanner.nextInt();

        // 张浩Java成绩大于90分，并且音乐成绩大于80分时，或者Java成绩等于100分，音乐成绩大于70分时
        if(scoreJava>90 && scoreMusic>80 || scoreJava==100 && scoreMusic>70){
            System.out.println("老师奖励他iPhone6s");
        }


    }
}
