package home.org.goods;

/**
 * @PackgeName: org.goods
 * @ClassName: Customer
 * @Author: lgx
 * @Date: 2020/5/25 20:23
 * @project name: practice
 * @Version: V1.0
 * @Description:
 */
public class Customer {
//    定义:购买物品方法
    public Goods buy(int type){
        Goods goods=null;
        switch(type){
            case 1:
                goods=new Tvs("智能电视",2000,"三星");
                break;
            case 2:
                goods =new Foods("卫龙辣条",10);
                break;
        }
        return goods;
    }
}
