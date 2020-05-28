package cbh.lx03;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
       /* //测试狗狗  QQ
        Pet dog = new Dog("欣欣",100,65.5,"拉布拉多");
        Pet qq = new QQ("QQ仔",99,68.5,"Q妹");
        dog.Show();
        qq.Show();*/
       //测试主人喂食
        Master master = new Master("007");
        Scanner input = new Scanner(System.in);
        System.out.println("请选择喂食对象：1.狗狗 2.企鹅！");
        switch (input.next()) {
            case "1":
                Pet dog = new Dog("欣欣",5,65.5,"拉布拉多");
               master.eat(dog);
               master.paly(dog);
                break;
            case "2":
                Pet qq = new QQ("QQ仔",99,68.5,"Q妹");
                master.eat(qq);
                master.paly(qq);

                break;
                default:
                    System.out.println("输入序号错误！");
                    break;
        }


    }
}
