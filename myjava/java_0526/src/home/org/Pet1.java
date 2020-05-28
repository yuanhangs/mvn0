package home.org;

/**
 * @PackgeName: org
 * @ClassName: Pet1
 * @Author: lgx
 * @Date: 2020/5/25 17:07
 * @project name: practice
 * @Version: V1.0
 * @Description:使用方法重写优化电子宠物系统
 */
public abstract class  Pet1 {
    //    定义属性：姓名，健康值和亲密度
    private String name;
    private int health;
    private int love;

//    构造方法

    public Pet1() {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public Pet1(String name, int health, int love) {
        this();
    }
//    set，get 方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
//        判断健康值是否在0~100
        if(this.getHealth()<0||this.getHealth()>100) {
            this.health=60;
        }else{
            this.health = health;
        }
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
//        判断亲密度是否中0~100
        if(this.getLove()<0||this.getLove()>100){
            this.love=60;
        }else {
            this.love = love;
        }
    }
    //    打印信息
    public void show(){
        System.out.println("宠物的姓名："+this.getName()+"\t健康值："+this.getHealth()+"\t和主人的亲密度"+this.getLove());

    }
    //    eat 方法
    public abstract void eat();
}
