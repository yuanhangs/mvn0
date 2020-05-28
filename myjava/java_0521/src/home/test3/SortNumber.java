package home.test3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: test3
 * @Author: lcj
 * @CreateTime: 2020-05-20 20:18
 * @Description: 编号0034，要求：从键盘输入10个整数存入一数组中，然后将该数组中的各元素按升序存放后显示出来。
 * 有参无返回值
 */
public class SortNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        //循环输入10个整数
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个整数：");
            arr[i] = scanner.nextInt();
        }
        //创建对象
        SortNumber sortNumber = new SortNumber();
        //调用方法并接收返回数组
        sortNumber.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //排序
    public void sort(int[] arr) {
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    //交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
