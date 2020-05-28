package org.sjy;

import java.util.Scanner;

public class Home5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要的手机号的尾号(最后一位0-9)");
        int phone = scanner.nextInt();
        switch (phone) {
            case 0:
                System.out.println("是50元一个！");
                break;
            case 1:

                System.out.println("是50元一个");
                break;
            case 2:
                System.out.println("是50元一个");
                break;
            case 3:
                System.out.println("是50元一个");
                break;
            case 4:
                System.out.println("是30元一个");
                break;
            case 5:
                System.out.println("是50元一个");
                break;
            case 7:
                System.out.println("是50元一个");
                break;
            case 6:
                System.out.println("是150元一个");
                break;
            case 8:
                System.out.println("是150元一个");
                break;
            case 9:
                System.out.println("是80元一个");
                break;
            default:

                System.out.println("输入错误");
                break;
        }
    }
}