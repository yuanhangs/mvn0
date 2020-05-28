package org.sjy;

/**
 * @ClassName Test6
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/29
 * @Version V1.0
 **/
public class Test8Math {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;
        System.out.println("整除：（余数）" + num1 % num2);
        System.out.println("除：（商）" + num1 / num2);

        //num1++;   //等同于 num1 =num1+1;
//        System.out.println(num1++);  //先赋值，后运算；
//        System.out.println(num1);   //num1+1; //6
//        System.out.println(++num1);   //先运算，再赋值； 7
//        System.out.println(num1);    //7

        //num2=2；
        System.out.println(num2--); //2
        System.out.println(num2++); //1
        System.out.println(++num2);//3
        System.out.println(num2--); //3

        num2+=10;  //等同于 num2=num2+10;
        System.out.println(num2); //12

        num2*=10;  //等同于num2=num2*10;
        System.out.println(num2);//120

    }
}
