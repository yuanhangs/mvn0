package home.org;

/**
 * @PackgeName: org
 * @ClassName: Dog
 * @Author: lgx
 * @Date: 2020/5/25 17:03
 * @project name: practice
 * @Version: V1.0
 * @Description:子类：狗狗
 */
public class Dog extends Pet1{
    private String kind;

//    构造方法
 public Dog() {
    }

    public Dog(String name, int health, int love, String kind) {
        super(name, health, love);
        this.kind = kind;
    }
//    set，get方法
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    public void show(){
     super.show();
        System.out.println("我是一只："+this.getKind());
    }

    @Override
    public void eat() {
     if(this.getHealth()<100) {
         this.setHealth(this.getHealth() + 3);
     }else {
         System.out.println(this.getName()+"吃饱了");
     }
    }
//    狗狗接飞盘方法
    public void getDisk(){
     System.out.println(this.getName()+"接飞盘");
    }

}
