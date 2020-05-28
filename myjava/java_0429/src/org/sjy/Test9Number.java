package org.sjy;

/**
 * @ClassName Test6
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/29
 * @Version V1.0
 **/
public class Test9Number {
    public static void main(String[] args) {
//        位数字的会员卡号,将各个位上数字求和
          int number=2982;
          int th=number/1000;  //1
          int hu=number/100%10; //9
          int te=number/10%10; //8
          int ze=number%10; //2

        System.out.println(th+hu+te+ze);

    }
}
