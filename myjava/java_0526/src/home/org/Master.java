package home.org;

/**
 * @PackgeName: org
 * @ClassName: Master
 * @Author: lgx
 * @Date: 2020/5/25 19:02
 * @project name: practice
 * @Version: V1.0
 * @Description:
 */
public class Master {
//    构造方法
    public Master(){

    }
//    领养宠物
    public Pet1 choice(int type){
        Pet1 pet=null;
//        判断宠物对象
        switch(type){
            case 1:
                pet=new Dog();
                break;
            case 2:
                pet=new Peguin();
                break;
        }
        return pet;
    }
}
