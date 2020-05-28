package home.test1;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: org.lcj
 * @Author: lcj
 * @CreateTime: 2020-05-20 16:49
 * @Description: 测试学生类
 */
public class TestStudent {
    public static void main(String[] args) {
        //创建对象
        Student student = new Student();
        //赋值
        student.name = "张浩";
        student.age = 10;
        student.className = "S1";
        student.hobby = "篮球";
        //调用方法
        student.show();
    }
}
