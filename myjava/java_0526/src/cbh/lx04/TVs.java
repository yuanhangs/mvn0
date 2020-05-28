package cbh.lx04;

//子类：TVs（电视类）
public class TVs extends Goods {
    String type ="电视类";

    public TVs() {
        super();
    }

    public TVs(String name, double sprice) {
        super(name, sprice);
    }

    public  void  ShowType(){
        System.out.println(type);
    };
}
