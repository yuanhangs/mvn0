package cbh.lx03;

//主人喂食
public class Master {
    String name;

    public Master(String name) {
        this.name = name;
    }

    public Master() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //传宠物对象
    public void eat(Pet pet) {
        System.out.println("喂食主人名称"+name);
        Pet pet1 = new Pet();
        pet1.eat(pet);
    }
    //娱乐
    public void paly(Pet pet) {
        System.out.println("yule主人名称"+name);
        Pet pet1 = new Pet();
        pet1.play(pet);
    }
}
