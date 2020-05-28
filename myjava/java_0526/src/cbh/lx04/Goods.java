package cbh.lx04;

//父类：Goods（商品类）
public class Goods {
    //名称
    String name;
    //价格
    double sprice;

    public Goods() {

    }

    public Goods(String name, double sprice) {
        this.name = name;
        this.sprice = sprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSprice() {
        return sprice;
    }

    public void setSprice(double sprice) {
        this.sprice = sprice;
    }

    public void ShowMasage(Goods goods) {
        if (goods instanceof Foods) {
            ((Foods) goods).ShowType();
            Cope();
        } else if (goods instanceof TVs) {
            ((TVs) goods).ShowType();
            Cope();
        }
    }

    public void Cope() {
        System.out.println("商品名称：" + getName() + "   价格" + getSprice());
    }
}
