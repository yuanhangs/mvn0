package org.sjy;

/**
 * @ClassName Test5
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/29
 * @Version V1.0
 **/
public class Test5 {

    public static void main(String[] args) {
//        某班第一次Java考试平均分81.29，第二次比第一次多2分，计算第二次考试平均分？

        //1.Java考试平均分81.29
         double scoreFirst=81.29;

        //2.多2分
        int rise =2;

//        第二次考试平均分
        //自动类型转换:
        double scoreSecond=scoreFirst+rise;

        System.out.println("第二次考试平均分:"+scoreSecond);

    }
}
