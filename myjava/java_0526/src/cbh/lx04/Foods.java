package cbh.lx04;

//Foods（食品类）
public class Foods  extends Goods {
    public Foods() {
        super();
    }

    public Foods(String name, double sprice) {
        super(name, sprice);
    }

    String type ="食品类";
    public  void  ShowType(){
        System.out.println(type);
    };
}

