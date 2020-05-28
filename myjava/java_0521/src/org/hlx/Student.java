package org.hlx;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/21
 * @Version V1.0
 **/
public class Student {
    //属性
    String name;
    int age;
    String sex;

    public Student(){
        this.name="张三";
        this.age=12;
        this.sex="男";
        System.out.println("无参构造方法！");
    }

//    public Student(String name,int age,String sex){
//        this.name=name;
//        this.age = age;
//        this.sex = sex;
//        System.out.println("有3个参数的参构造方法！");
//    }

    public Student(String name,int age,String sex){
        this(name,sex);  //调用有2个参数的参构造方法(只能第一行)
        this.age = age;
        System.out.println("有3个参数的参构造方法！");
    }

    public Student(String name,String sex){
        this.name=name;
        this.sex = sex;
        System.out.println("有2个参数的参构造方法！");
    }

    public Student(String name){
        this();  //调用无参的构造方法
        this.name=name;
        System.out.println("有1个参数的参构造方法！");
    }
    public Student(int age){
        this.age=age;
        System.out.println("有1个参数的参构造方法！");
    }

    @Override    //注解：重写
    public String toString() {
         this.show();   //调用方法
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }


    public  void show(){
        System.out.println("student method!");
    }
}
