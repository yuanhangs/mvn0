package home.org.goods;

import java.util.Scanner;

/**
 * @PackgeName: org.goods
 * @ClassName: TestGoods
 * @Author: lgx
 * @Date: 2020/5/25 20:22
 * @project name: practice
 * @Version: V1.0
 * @Description:
 */
public class TestGoods {
    public static void main(String[] args){
//        创建Scanner对象
        Scanner input=new Scanner(System.in);
//        创建Customer对象
        Customer customer=new Customer();
        System.out.print("请输入购买物品：1，Tvs  2,foods");
        int num=input.nextInt();
        //
        Goods buyGoods=customer.buy(num);
        if(buyGoods instanceof Tvs){
           buyGoods.printPrice();
        }
        if(buyGoods instanceof  Foods){
            buyGoods.printPrice();
        }
    }
}
