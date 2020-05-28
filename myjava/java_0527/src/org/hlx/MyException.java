package org.hlx;

/**
 * @ClassName MyException
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/27
 * @Version V1.0
 **/

/**
 * 自定义异常
 */
public class MyException extends  Exception {
    public MyException(String message) {
        super(message);
    }
}

class Person{
    public void setAge(int age) throws MyException {
        if(age>=18 && age<=60){
            System.out.println("age="+age);
        }else{
            throw new MyException("年龄只能在18~60之间!");
        }
    }
}

class  TestPerson{
    public static void main(String[] args) throws MyException {
        Person person =new Person();
        person.setAge(16);
    }
}