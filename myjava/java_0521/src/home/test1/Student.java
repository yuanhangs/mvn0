package home.test1;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: org.lcj
 * @Author: lcj
 * @CreateTime: 2020-05-20 16:46
 * @Description: 输出学生信息
 */
public class Student {
    //属性
    String name;
    int age;
    String className;
    String hobby;

    //方法
    public void show(){
        System.out.println(name+"\n年龄："+age+"\n就读于:"+className+"班\n爱好："+hobby);
    }
}
