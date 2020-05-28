package org.sjy;

/**
 * @ClassName Test1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/30
 * @Version V1.0
 **/
public class Test1 {

    public static  void main(String[] args){
       int num1 =10;
       int num2=20;
       //关系运算符
        System.out.println(num1== num2); //10==20
        System.out.println(num1>= num2);
        System.out.println(num1<= num2);
        System.out.println(num1!= num2);

        int num3=30;
        //逻辑运算符  && || !
        System.out.println(num1>num2 && num1<num3);  //短路与
        System.out.println(num1<num2 || num1>num3);  //短路或
        System.out.println(!(num1<num2));  //非

//        优先级别 ! > && > ||


        //*三元运算符
        //(条件)?(true):(false)
        String result = (num1<num3)?("真"):("假");
        System.out.println("result="+result);

        //判断奇偶数
        result= (5%2==0)?("Yes"):("No");
        System.out.println("result="+result);

    }

}
