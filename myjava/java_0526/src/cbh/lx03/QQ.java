package cbh.lx03;
//企鹅类
public class QQ extends Pet{
    //性别
    String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public QQ(String name, int health, double lovely, String sex) {
        super(name, health, lovely);
        this.sex = sex;
    }

    public QQ() {
    }

    public QQ(String sex) {
        this.sex = sex;
    }
    public  void  Show() {
        super.Show();
        System.out.println("我是的性别是"+sex);
    }

}
