package org.fsf;

import java.util.Scanner;

/**
 * @ClassName:Test2
 * @Description:
 * @Author:付世峰
 * @Date:14:39 2020/5/18
 * @Version:1.0
 */
public class Test2 {
    /**
     *从键盘上接收一批整数，比较并输出其中的最大值和最小值，输入数字0时结束循环
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //提示用户输入数据
        System.out.print("输入整数，输入0结束：");
        //用于保存最大值
        int max;
        //用于保存最小值!
        int min;
        //用于保存键盘录入的数据
        int num;
        //把值暂设为第一次录入的值
        min = max = num = sc.nextInt();

        while (num != 0) {
            //如果录入的值比储存最小值还小，就替换掉
            if (num < min) {
                min = num;
            }
            //如果录入的值比储存最大值还大，也替换掉
            if (num > max) {
                max = num;
            }
            //提示输入
            System.out.print("输入一个整数,输入0结束：");
            //结束用户输入信息
            num = sc.nextInt();
        }
        //输出最大值和最小值
        System.out.println("最大值：" + max + " 最小值：" + min);


    }
}
