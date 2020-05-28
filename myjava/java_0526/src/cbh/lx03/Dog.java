package cbh.lx03;
//小狗类
public class Dog  extends Pet{
    //狗狗类型
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dog(String name, int health, double lovely, String type) {
        super(name, health, lovely);
        this.type = type;
    }

    public  void  Show() {
        super.Show();
        System.out.println("我是一只"+type);
    }

}

