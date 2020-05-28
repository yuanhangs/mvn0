package org.hlx;

/**
 * @ClassName Pet
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/26
 * @Version V1.0
 * 父类
 **/
public abstract class Pet {
    public abstract  void eat();

//    没有抽象构造方法，也没有抽象静态方法
//    public  abstract Pet(){
//        System.out.println("无参构造方法！");
//    }
//
//    public abstract static void show();
}

/**
 * 子类
 */
class  Dog extends  Pet{

    @Override
    public void eat() {
        System.out.println("dog eat ll");
    }
}
//如果子类没有实现父类的所有抽象方法，子类必须被定义为抽象类
abstract  class  Tiger extends  Pet{
}