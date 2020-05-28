package org.sjy;

/**
 * @ClassName Test6
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/29
 * @Version V1.0
 **/
public class Test7 {
    public static void main(String[] args) {
        // 学员王浩的Java成绩是80分，学员张萌的Java成绩与王浩的相同，输出张萌的成绩

        //王浩的Java成绩是80分
        int whScore = 80;

        //学员张萌的Java成绩与王浩的相同
        int zmScore = whScore;

        //错误的！！！
//        int zmScore;
//        int whScore =zmScore;

        //张萌的成绩
        System.out.println("张萌的成绩=" + zmScore);

        //交换数据9和8
        int num1 = 9;
        int num2 = 8;
        System.out.println("num1="+num1+"\tnum2="+num2);
        //开始交换(必须会!)
        //空位置
        int temp=0;
        temp=num1;   //temp=9;
        num1 =num2;  //num1=8;
        num2 =temp;  //num2=9
        System.out.println("num1="+num1+"\tnum2="+num2);


    }
}
