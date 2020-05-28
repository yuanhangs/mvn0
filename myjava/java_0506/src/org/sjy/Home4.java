package org.sjy;

import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("你到中午准备吃点啥？(青菜/豆腐/水果/鸡肉/牛肉)");
//        int a = scanner.nextInt();
        String food = scanner.next();

        switch (food) {
            case "青菜":
                System.out.println("青菜：有营养又好吃，有眼光；");
                break;
            case "豆腐":
                System.out.println("豆腐：开发智力有帮助，聪明！");
                break;
            case "水果":
                System.out.println("水果：味道不错，但是好像热量不够！");
                break;
            case "鸡肉":
                System.out.println("鸡肉：担心传染禽流感！");
                break;
            case "牛肉":
                System.out.println("牛肉：担心传染牛疯病！");
                break;
            default:
                System.out.println("不吃啦！难道要减肥？");
                break;
        }

    }
}
