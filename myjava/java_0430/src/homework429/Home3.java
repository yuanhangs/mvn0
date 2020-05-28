package homework429;

import java.util.Scanner;

/**
 * @ClassName Home1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/30
 * @Version V1.0
 * 编号0003，要求：从键盘输入三个整数，分别存入x,y,z三个整型变量中，并将(X+y)*z的结果显示出来。
 **/
public class Home3 {
    public static void main(String[] args) {

        //1.输入对象(只能写一次)
        Scanner scanner = new Scanner(System.in);
        //2.好提示
        System.out.print("输入第一个整数:");
        int number1 = scanner.nextInt();

        //2.好提示
        System.out.print("输入第二个整数:");
        int number2 = scanner.nextInt();

        //2.好提示
        System.out.print("输入第三个整数:");
        int number3 = scanner.nextInt();

        //3.(X+y)*z
        int number = (number1+number2)*number3;

        //4.显示结果
        System.out.println("number=" + number);

    }
}
