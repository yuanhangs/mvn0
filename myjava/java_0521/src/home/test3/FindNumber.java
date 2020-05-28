package home.test3;

import java.util.Scanner;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: test3
 * @Author: lcj
 * @CreateTime: 2020-05-20 19:55
 * @Description: 编号0032，输入10个整型数据，找出其中的最大值并显示出来。
 * 无参无返回值
 */
public class FindNumber {
    public static void main(String[] args) {
        FindNumber fn = new FindNumber();
        fn.findMax();
    }

    public void findMax() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入10个整数：");
            int num = scanner.nextInt();
            //第一个数作为比较
            if (i == 0) {
                max = num;
            }
            //如果比最大的大  交换
            if (num > max) {
                max = num;
            }
        }
        System.out.println("最大的数：" + max);
    }
}
