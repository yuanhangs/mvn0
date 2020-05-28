package home.org.goods;

/**
 * @PackgeName: org.goods
 * @ClassName: Goods
 * @Author: lgx
 * @Date: 2020/5/25 20:02
 * @project name: practice
 * @Version: V1.0
 * @Description:自定义类和方法，使用父类作为返回值实现打印 不同类型商品价格功能
 * 父类：Goods（商品类）
 * 子类：TVs（电视类）、Foods（食品类）
 */
public abstract class Goods {
    //    定义属性
    private String goodsName;
    private double price;
//构造方法

    public Goods() {
    }

    public Goods(String goodsName, double price) {
        this.goodsName = goodsName;
        this.price = price;
    }
//set，get方法

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //    定义方法
    public abstract void printPrice();
}

class Tvs extends Goods {
    private String brand;

    //    构造方法
    public Tvs() {
    }

    public Tvs(String brand) {
        this.brand = brand;
    }

    public Tvs(String goodsName, double price, String brand) {
        super(goodsName, price);
        this.brand = brand;
    }
//set，get方法

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void printPrice() {
        System.out.println("这是" + this.getBrand() + "\t电视，价格：\t" + this.getPrice());
    }
}

class Foods extends Goods {

    //    构造 方法
    public Foods() {
    }

    public Foods(String goodsName, double price) {
        super(goodsName, price);
    }

    @Override
    public void printPrice() {
        System.out.println("这是" + this.getGoodsName() + "\t价格：\t" + this.getPrice());
    }
}