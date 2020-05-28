package home.test3;

import java.util.Scanner;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: test3
 * @Author: lcj
 * @CreateTime: 2020-05-20 20:07
 * @Description: 编号0033，要求：从键盘输入10个整数存入一数组中,并计算一维数组中所有元素的平均值。
 * 无参有返回值
 */
public class NumberAvg {
    public static void main(String[] args) {
        //创建对象
        NumberAvg na = new NumberAvg();
        //调用方法并接收返回值
        double avg = na.calculateAvg();
        System.out.println("平均数为："+avg);
    }

    public double calculateAvg() {
        //数组
        int[] numbers = new int[10];
        //平均数
        double avg = 0;
        //总数
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        //循环输入
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个数：");
            int num = scanner.nextInt();
            numbers[i] = num;
            sum += num;
        }
        //计算平均数
        avg = sum / numbers.length;
        return avg;
    }
}
