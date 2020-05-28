package org.hlx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.InputMismatchException;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/27
 * @Version V1.0
 **/
public class Student {
    private String sex;

    public String getSex() {
        return sex;
    }

    /**
     * throws 可以抛多个异常，子类，父类没有顺序;
     * @param sex
     * @throws Exception
     * @throws InputMismatchException
     */
    public void setSex(String sex) throws  Exception, InputMismatchException {
        if ("女".equals(sex) || "男".equals(sex)) {
            this.sex = sex;
        } else {
            throw new Exception("性别只能是男或女！");
        }
    }


}


class TestStudent{
    public static void main(String[] args) throws Exception {
        Student stu =new Student();
        stu.setSex("男2");

//        InputStream is = null;
//        try {
//            is = new FileInputStream("aa.txt");
//            is.read();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}