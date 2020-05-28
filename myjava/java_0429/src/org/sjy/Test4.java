package org.sjy;
import  java.util.Scanner;


/**
 * @ClassName Test4
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/29
 * @Version V1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        //1.导包自动
        //2.创建对象
        Scanner scanner=new Scanner(System.in);
        //3.使用
        //友好提示
        System.out.print("请输入您的姓名：");
        String name = scanner.next();

        //友好提示
        System.out.print("请输入您的年龄：");
        int age = scanner.nextInt();

        //友好提示
        System.out.print("请输入您的java成绩：");
        float score = scanner.nextFloat();
//        double scored=scanner.nextDouble();

        //*注意：输入字符时，我们只能用字符串；

        //输出
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("score="+score);


    }
}
