package home.test2;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.util.Scanner;

/**
 * @BelongsProject: myjava
 * @BelongsPackage: org.lcj
 * @Author: lcj
 * @CreateTime: 2020-05-20 16:56
 * @Description: ${Description}
 */
public class UserMgr {
    //初始化属性   用户名
    String userName = "admin";
    //密码
    String pwd = "111111";

    /**
     * 登录方法
     * @param name
     * @param pwd
     * @return
     */
    public boolean isLogin(String name, String pwd) {
        if (userName.equals(name) && pwd.equals(pwd)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 修改密码
     * @param newPwd
     */
    public String update(String newPwd){
        this.pwd=newPwd;
        return(pwd);
    }

    //修改密码
    public void updatePwd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String pwd1 = scanner.next();
        //判断密码是否正确
        if (userName.equals(name) && pwd.equals(pwd1)) {
            System.out.print("请输入新密码：");
            pwd = scanner.next();
            System.out.println("修改密码成功，您的新密码是：" + pwd);
        } else {
            System.out.println("用户名和密码不匹配，您没有权限更新管理员信息");
        }
    }


}
