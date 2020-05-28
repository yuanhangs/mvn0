package org.hlx;

/**
 * @ClassName Tiger
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/21
 * @Version V1.0
 **/
public class Tiger {
    //属性--》成员变量:默认值
    int age;
    double money;

    @Override
    public String toString() {
        return "Tiger{" +
                "age=" + age +
                ", money=" + money +
                '}';
    }

    public void show(){
        //局部变量:必须赋值
        int age=10;
        System.out.println(age);
    }

    public void display(){
        int age=20;
    }
}
