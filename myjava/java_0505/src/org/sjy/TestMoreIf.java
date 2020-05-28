package org.sjy;

import java.util.Scanner;

/**
 * @ClassName TestIf
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class TestMoreIf {
    public static void main(String[] args){
    //     对学员的考试成绩评测 0-100
    //成绩>=80 ：良好
    //成绩>=60 ：中等
    //成绩<60   ：差

        //输入对象
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入考试成绩：");
        int score=scanner.nextInt();

//        //分数只能在0-100之间！！
        if(score>=0 && score<=100) {
            if (score >= 80) { //80~100
                System.out.println("良好");
            } else if (score >= 60) {  //60~79
                System.out.println("中等");
            } else { //0~59
                System.out.println("差");
            }
        }


//        //分数只能在0-100之间！！
//        if(score>=0 && score<=100) {
//            if (score >= 60) {
//                System.out.println("中等");
//            } else if (score >= 80) {
//                System.out.println("良好");
//            } else { //0~59
//                System.out.println("差");
//            }
//        }
    }
}
