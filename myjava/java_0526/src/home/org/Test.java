package home.org;

import java.util.Scanner;

/**
 * @PackgeName: org
 * @ClassName: Test
 * @Author: lgx
 * @Date: 2020/5/25 19:08
 * @project name: practice
 * @Version: V1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        创建Master对象
        Master master = new Master();
        System.out.print("请选择宠物：1，狗狗  2，企鹅");
        int num = input.nextInt();
//        创建宠物对象
        Pet1 pet = master.choice(num);
//判断宠物类型
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            dog.setName("多多");
            dog.setHealth(78);
            dog.setLove(89);
            dog.setKind("比特");
            dog.show();
            dog.getDisk();
        }
        if (pet instanceof Peguin) {
            Peguin peguin = (Peguin) pet;
            peguin.setName("小黑");
            peguin.setHealth(58);
            peguin.setLove(79);
            peguin.setSex("Q妹");
            peguin.show();
            peguin.swim();
        }
    }
}
