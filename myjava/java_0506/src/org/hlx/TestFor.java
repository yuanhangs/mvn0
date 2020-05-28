package org.hlx;

import java.util.Scanner;

/**
 * @ClassName TestWhile
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/6
 * @Version V1.0
 **/
public class TestFor {
    public static void main(String[] args) {
        //1-10
//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }

//        int i=1;
//        for(;i<=15;){
//            System.out.println(i);
//            i++;
//        }


        int sum =0;
        for (int i = 1; i <11 ; i++) {
            if(i%2==0) {
                System.out.println(i);
                //累计和
                sum += i;
            }

        }
        System.out.println("sum="+sum);
    }
}
