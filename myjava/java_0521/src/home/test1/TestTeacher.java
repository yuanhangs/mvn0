package home.test1;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: org.lcj
 * @Author: lcj
 * @CreateTime: 2020-05-20 16:49
 * @Description: 测试学生类
 */
public class TestTeacher {
    public static void main(String[] args) {
        //创建对象
        Teacher teacher = new Teacher();
        //赋值
        teacher.name = "王老师";
        teacher.major = "计算机";
        teacher.teachClass = "使用java语言理解程序逻辑";
        teacher.teachYear = 5;
        //调用方法
        teacher.show();
    }
}
