package org.hlx.item;

import java.util.Scanner;

/**
 * @ClassName OrderMenu
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/13
 * @Version V1.0
 **/
public class OrderMenu {
    public static void main(String[] args) {

        //键盘输入对象
        Scanner scanner = new Scanner(System.in);

        //循环
        do {
            System.out.println("欢迎使用吃货联盟订餐系统");
            System.out.println("****************************");
            System.out.println("1、我要订餐");
            System.out.println("2、查看餐袋");
            System.out.println("3、签收订单");
            System.out.println("4、删除订单");
            System.out.println("5、我要点赞");
            System.out.println("6、退出系统");
            System.out.println("****************************");
            System.out.print("请选择:");
            int choose = scanner.nextInt();
            //分支
            switch (choose) {
                case 1:
                    System.out.println("***我要订餐***");
                    break;
                case 2:
                    System.out.println("***查看餐袋***");
                    break;
                case 3:
                    System.out.println("***签收订单***");
                    break;
                case 4:
                    System.out.println("***删除订单***");
                    break;
                case 5:
                    System.out.println("***我要点赞***");
                    break;
                case 6:
                default:
                  System.out.println("谢谢使用，欢迎下次光临！");
                  return;
            }
            //
            System.out.print("输入0返回：");
            choose = scanner.nextInt();
        } while (true);
    }
}
