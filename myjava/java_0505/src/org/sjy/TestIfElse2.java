package org.sjy;

import java.util.Scanner;

/**
 * @ClassName TestIf
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class TestIfElse2 {
    public static void main(String[] args) {
//        如果今天下雨，我就呆在家里学习， 不下雨，我就出去玩!

        //输入对象
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入下雨（Y)/(N)：");
        String rain = scanner.next();

//          如果今天下雨，我就呆在家里学习
          if(rain.equals("Y")) {
              System.out.println("呆在家里学习!");
          }else{
              System.out.println("就出去玩!");
          }

        //ctrl+alt+L 格式化代码
        //如果是一条语句时，可以省略{}；
//        if (rain.equals("Y"))
//            System.out.println("呆在家里学习!");
//        else
//            System.out.println("就出去玩!");

    }
}
