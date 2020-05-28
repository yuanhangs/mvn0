package org.hlx;

import java.util.Scanner;

/**
 * @ClassName TestArray2
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class TestArray5 {

    public static void main(String[] args) {
        //从键盘输入5位学员的成绩存入数组中

        //声明数组开辟大小
        int[] ages =new int[5];


        //1.键盘输入对象
        Scanner scanner =new Scanner(System.in);

        for (int i = 0; i <ages.length; i++) {
            //2.友好提示输入
            System.out.print((i+1)+"成绩:");
            int age=scanner.nextInt();
            //存入
            ages[i]=age;

        }

        //显示数组存入的数据 (数组大小一般用:数组名.length)
        for (int i = 0; i <ages.length ; i++) {
            System.out.print(ages[i]+"\t");
        }

        System.out.println();

        //默认第一个为最大值
        int max =ages[0];

        //最小值？？？
        int min =ages[0];

        //循环
        for (int i = 1; i <ages.length ; i++) {

            //比较
            if(ages[i]>max){
                max=ages[i];
            }
            else if(ages[i]<min){
                min =ages[i];
            }
        }

        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
