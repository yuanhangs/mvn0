package org.sjy;

import java.util.Scanner;

/**
 * @ClassName TestIf
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class TestIfElse {
    public static void main(String[] args){
//        如果张浩Java考试成绩大于90分，老师就奖励他一个iPhone6s 否则老师就罚他蹲马步

        //输入对象
        Scanner scanner =new Scanner(System.in);
        System.out.print("输入Java成绩：");
        int scoreJava=scanner.nextInt();

//        如果张浩Java考试成绩大于90分，老师就奖励他一个iPhone6s
          if(scoreJava>90) {
              System.out.println("老师奖励他iPhone6s");
          }else{
              System.out.println("罚他蹲马步");
          }
    }
}
