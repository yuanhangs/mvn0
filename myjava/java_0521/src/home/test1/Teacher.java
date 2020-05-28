package home.test1;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: org.lcj
 * @Author: lcj
 * @CreateTime: 2020-05-20 16:46
 * @Description: 输出教员信息
 */
public class Teacher {
    //属性
    String name;
    String major;
    String teachClass;
    int teachYear;

    //方法
    public void show() {
        System.out.println(name + "\n专业方向：" + major + "\n教授课程:" + teachClass + "\n教龄：" + teachYear);
    }
}
