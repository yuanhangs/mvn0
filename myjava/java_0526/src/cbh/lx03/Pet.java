package cbh.lx03;
//宠物类
public class Pet {
    //宠物名称
    String name;
    //健康值
    int health;
    //亲密度
    double lovely;

    public Pet(String name, int health, double lovely) {
        this.name = name;
        this.health = health;
        this.lovely = lovely;
    }

    public Pet() {
    }

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
        this.health = health;
    }

    public double getLovely() {
        return lovely;
    }

    public void setLovely(double lovely) {
        this.lovely = lovely;
    }

    //宠物属性独白
    public void Show() {
        System.out.println("宠物的白白");
        System.out.println("我的名字叫"+name+"我的健康值是："+health+"我个主人的亲密度是:"+lovely);
    }
    //喂食

    public  void eat(Pet pet) {
        //        判断企鹅+5 狗狗+3
        if (pet instanceof Dog) {
            System.out.println("原健康值:"+pet.health+"喂食成功,"+pet.name+"现健康值："+(pet.health+3));
        } else if (pet instanceof QQ) {
            System.out.println("原健康值:"+pet.health+"喂食成功,"+pet.name+"现健康值："+(pet.health+5));
        }
    }
    //多态实现主人领养宠物并与宠物玩耍功
    public  void play(Pet pet) {
        //        判断企鹅+5 狗狗+3
        if (pet instanceof Dog) {
            System.out.println("狗具有特有的接飞盘方法");
        } else if (pet instanceof QQ) {
            System.out.println("企鹅具有特有的南极游泳方法");
        }
    }

}
