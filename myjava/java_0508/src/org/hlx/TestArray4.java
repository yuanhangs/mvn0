package org.hlx;

import java.util.Scanner;

/**
 * @ClassName TestArray2
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class TestArray4 {

    public static void main(String[] args) {
        //从键盘输入5位学员的年龄存入数组中

        //声明数组开辟大小
        int[] ages =new int[2];

        //声明累计和
        int sum=0;

        //1.键盘输入对象
        Scanner scanner =new Scanner(System.in);

        for (int i = 0; i <ages.length; i++) {
            //2.友好提示输入
            System.out.print((i+1)+"-年龄");
            int age=scanner.nextInt();
            //存入
            ages[i]=age;

            //累计和
            sum+=ages[i];
        }

        System.out.println("总计："+sum);
        //显示数组存入的数据 (数组大小一般用:数组名.length)
        for (int i = 0; i <ages.length ; i++) {
            System.out.println(ages[i]);
        }


    }
}
