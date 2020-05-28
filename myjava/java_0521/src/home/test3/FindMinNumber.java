package home.test3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: test3
 * @Author: lcj
 * @CreateTime: 2020-05-20 20:28
 * @Description: 编号0035，要求：从键盘输入一个5整数存入数组，找出其中的最小值并显示出来。
 * 有参有返回值
 */
public class FindMinNumber {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("请输入第"+(i+1)+"个数：");
            arr[i] = scanner.nextInt();
        }
        //创建对象
        FindMinNumber findMinNumber = new FindMinNumber();
        //调用方法
        int min = findMinNumber.findMin(arr);
        System.out.println("最小的数是："+min);

    }

    //找出最小的数
    public int findMin(int[] arr){
        //假设数组第一个数最小
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
