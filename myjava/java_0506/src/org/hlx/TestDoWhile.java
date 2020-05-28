package org.hlx;

import java.util.Scanner;

/**
 * @ClassName TestWhile
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/6
 * @Version V1.0
 **/
public class TestDoWhile {
    public static void main(String[] args) {
//        老师每天检查张浩的学习任务是否合格，如果不合格，则继续进行。
//        老师给张浩安排的每天的学习任务为：上午阅读教材，学习理论部分，下午上机编程，掌握代码部分

        Scanner scanner = new Scanner(System.in);

        //1.初值
        String str = "";

        do {
            //2.循环内容
            System.out.println("上午阅读教材，学习理论部分，\n下午上机编程，掌握代码部分");

            //3.改变初值
            System.out.print("是否合格？（Y/N）");
            str = scanner.next();

        } while ("N".equals(str)); //4.条件

    }
}
