package home.test3;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: test3
 * @Author: lcj
 * @CreateTime: 2020-05-20 17:11
 * @Description: 编号0031，要求：从键盘输入x的值，计算并打印下列分段函数的值。
 * y=0(x<60)
 * y=1(60<=x<70)
 * y=2(70<=x<80)
 * y=3(80<=x<90)
 * y=4(x>=90)
 * 无参有返回值
 */
public class PrintNumber {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入x的值：");
        double x = scanner.nextDouble();
        int y = p.printNumber(x);
        System.out.println("y的值为：" + y);
    }

    public int printNumber(double x) {
        int y = 0;
        if (x >= 90) {
            y = 4;
        } else if (x >= 80) {
            y = 3;
        } else if (x >= 70) {
            y = 2;
        } else if (x >= 60) {
            y = 1;
        } else {
            y = 0;
        }
        return y;
    }
}
