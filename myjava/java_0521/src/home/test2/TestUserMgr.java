package home.test2;

import java.util.Scanner;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: org.lcj
 * @Author: lcj
 * @CreateTime: 2020-05-20 17:05
 * @Description: 测试用户管理系统
 */
public class TestUserMgr {
    public static void main(String[] args) {
        //创建对象
        UserMgr userMgr = new UserMgr();
        //调用方法
        // userMgr.updatePwd();

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String pwd1 = scanner.next();
        //调用方法
        if (userMgr.isLogin(name, pwd1)) {
            //
            System.out.print("请输入新密码：");
            String newPwd = scanner.next();
            //修改密码方法
            String news= userMgr.update(newPwd);
            System.out.println("修改密码成功，您的新密码是：" + news);
        } else {
            System.out.println("用户名和密码不匹配，您没有权限更新管理员信息");
        }
    }
}
