package cbh.lx04;

import java.util.Scanner;

public class Test06 {
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String  check = null;
        System.out.println("1.电视机 2.食物");
        System.out.println("请输入你要查看类型");
        check = input.next();
        switch (check) {
            case "1":
                Goods tVs = new TVs("七彩虹电视",18888);
                tVs.ShowMasage(tVs);
                break;
            case "2":
                Goods foods = new Foods("七彩虹",10);
                foods.ShowMasage(foods);
                break;
                default:
                    System.out.println("输入错误！");

        }
    }
}
