package org.hlx;

import java.util.Scanner;

/**
 * @ClassName Test1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/27
 * @Version V1.0
 **/
public class Test3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {  //有可能发生异常
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();

            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);

        }finally {
            System.out.println("执行！！！");
        }

        System.out.println("感谢使用本程序！");

    }
}
