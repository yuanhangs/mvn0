package org.org.lcj;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: org.lcj
 * @Author: lcj
 * @CreateTime: 2020-05-18 14:30
 * @Description: 编写一个java程序，实现输出1-50中所有不能被7整除的数,并求其和。
 */
public class Homework1 {
    public static void main(String[] args) {
        //累计
        int sum = 0;
        //记录一行的个数
        int num = 0;
        for (int i = 1; i <= 50; i++) {
            //判断是否为7的倍数，如果是，继续下一次循环
            if (i % 7 == 0) {
                continue;
            }
            //个数+1
            num++;
            sum += i;
            System.out.print(i + "\t");
            //判断一行的个数是否为5的倍数
            if (num % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n数据之和:" + sum);
    }
}
