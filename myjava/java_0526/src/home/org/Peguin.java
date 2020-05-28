package home.org;

/**
 * @PackgeName: org
 * @ClassName: Peguin
 * @Author: lgx
 * @Date: 2020/5/25 17:16
 * @project name: practice
 * @Version: V1.0
 * @Description:
 */
public class Peguin extends Pet1 {
    private String sex;
//    构造方法
    public Peguin() {
    }

    public Peguin(String name, int health, int love) {
        super(name, health, love);
    }

    public Peguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if("Q妹".equals(this.sex)||"Q仔".equals(this.sex))
        this.sex = sex;
        else
            this.sex="Q仔";
    }

    //    重写打印宠物信息
    public void show(){
        super.show();
        System.out.println("我的性别"+this.getSex());
    }
    @Override
    public void eat() {
        if(this.getHealth()<100){
            this.setHealth(this.getHealth()+5);
        }else {
            System.out.println(this.getName()+"吃饱了");
        }
    }
//    企鹅游泳方法
    public void swim(){
        System.out.println(this.getName()+"在南极游泳");
    }

}
