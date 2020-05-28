package org.lgx;

import java.util.Scanner;

/**
 * @autor: lgx
 * @date: 2020.05.05
 * @content: 您到中午准备吃点啥？（青菜/豆腐/水果/鸡肉/牛肉）
 *      青菜：有营养又好吃，有眼光；
 *      豆腐：开发智力有帮助，聪明!；
 *      水果：味道不错,但是好像热量不够!；
 *      鸡肉：当心传染禽流流感！
 *      牛肉：当心传染疯牛病！
 *      不吃啦？难道要减肥？
 */
public class Home_6 {
    public static void main(String[] args){
//        提示输入
        System.out.print("请输入中午吃：(青菜/豆腐/水果/鸡肉/牛肉）?");
//        创建Scanner对象
        Scanner input=new Scanner(System.in);
//        键入
        String lunch=input.next();
//        判断午餐,并打印输出
        switch(lunch){
            case "青菜":
                System.out.println(lunch+":有营养又好吃，有眼光；");
                break;
            case " 豆腐":
                System.out.println(lunch+":开发智力有帮助，聪明!；");
                break;
            case "水果":
                System.out.println(lunch+":味道不错,但是好像热量不够!；");
                break;
            case "鸡肉":
                System.out.println(lunch+":当心传染禽流流感！");
                break;
            case "牛肉":
                System.out.println(lunch+":当心传染疯牛病！");
                break;
            default:
                System.out.println("不吃啦？难道要减肥？");
                break;
        }
    }
}
