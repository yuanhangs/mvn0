package org.sjy;

/**
 * @ClassName Test6
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/29
 * @Version V1.0
 **/
public class Test6 {
    public static void main(String[] args) {
//        去年Apple笔记本所占市场份额是20，今年增长市场份额是9.8，求今年所占份额？
        //市场份额是20
        int number1 = 20;
        //份额是9.8
        double rise = 9.8;
//        今年所占份额
        int number2 =(int)(number1 + rise);
        System.out.println("今年所占份额:"+number2);
    }
}
