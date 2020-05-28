package homework429;

import java.util.Scanner;

/**
 * @ClassName Home1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/30
 * @Version V1.0
 * 编号0009，要求：计算从键盘上输入的一个数的平方值和立方值，并显示出来。
 **/
public class Home9 {
    public static void main(String[] args) {

        //1.输入对象(只能写一次)
        Scanner scanner = new Scanner(System.in);

        //2.好提示
        System.out.print("输入第一个整数:");
        int number1 = scanner.nextInt();


        //3.一个数的平方值
        int numberResult = number1*number1;

        //3.一个数的立方值
        int numberResult2 = number1*number1*number1;

        //4.显示结果
        System.out.println("numberResult=" + numberResult);
        System.out.println("numberResult2=" + numberResult2);

    }
}
