package org.org.lcj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: org.lcj
 * @Author: lcj
 * @CreateTime: 2020-05-18 14:38
 * @Description: 从键盘上接收一批整数，比较并输出其中的最大值和最小值，输入数字0时结束循环
 */
public class Homework2 {
    public static void main(String[] args) {
        //数组
        int[] arr = new int[1];
        //键盘输入
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("输入一个整数（输入0时结束）：");
            int num = scanner.nextInt();
            //如果为0，退出循环
            if (num == 0) {
                break;
            }
            //将键盘输入的数组存入数组中
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = num;
        }
        //排序
        Arrays.sort(arr);
        //
        if(arr[0]!=0) {
            //输出最大值最小值
            System.out.print("最大值：" + arr[arr.length - 1]);
            System.out.println("\t\t\t最小值：" + arr[0]);
        }
    }
}
