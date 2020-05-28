package homework429;

import java.util.Scanner;

/**
 * @ClassName Home1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/30
 * @Version V1.0
 * 编号0001，要求：从键盘输入一个整数，并将其值加1后显示出来
 **/
public class Home1 {
    public static void main(String[] args) {
        //1.友好提示
        System.out.print("输入一个整数:");

        //2.输入对象
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //3.其值加1后
        number++;

        //4.显示结果
        System.out.println("number=" + number);

    }
}
