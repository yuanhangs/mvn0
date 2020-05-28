package org.lgx;

import java.util.Scanner;

/**
 * @autor: lgx
 * @date: 2020.05.05
 * @content: 手机品牌评论(你想买哪个品牌的手机？(诺基亚/三星/摩托罗拉/索爱/飞利浦/...))
 */
public class Home_8 {
    public static void main(String[] args){
//        提示输入
        System.out.print("你想买哪个品牌的手机？(诺基亚/三星/摩托罗拉/索爱/飞利浦/...)");
//        创建Scanner对象
        Scanner input=new Scanner(System.in);
//        键入
        String cellphone=input.next();
//        判断手机类型,并打印输出推荐度
        switch(cellphone){
            case "诺基亚":
                System.out.println(cellphone+": 操作简单，摔不坏，价格实惠，但外形不太好看.\n" +
                        "推荐指数：*****");
                break;
            case " 三星":
                System.out.println(cellphone+":  色彩、铃声出色，外形不错，但价格比较贵。\n" +
                        "推荐指数：*****");
                break;
            case "摩托罗拉":
                System.out.println(cellphone+":  高档机性能很好，但低档机问题比较多\n" +
                        "推荐指数：*****");
                break;
            case "索爱":
                System.out.println(cellphone+":各方面都不错，但软件反应速度比较慢\n" +
                        "推荐指数：*****");
                break;
            case "飞利浦":
                System.out.println(cellphone+"  待机时间长，但界面不太美观\n" +
                        "推荐指数：*****");
                break;
            default:
                System.out.println("选其他品牌就要小心啦\n" +
                        "推荐指数：*****");
                break;
        }
    }
}
