package org.jwj2;

public class Test01 {
    public static void main(String[] args) {
        //友好提示
        System.out.println("1-50之间不能被7整除的数为：");
        //统计次数
        int count = 1;
        //统计和
        int sum = 0;
        //for循环
        for (int i = 1; i <= 50; i++) {
            //if控制7跳过
            if (i%7 == 0){
                continue;
            }
            //输出
            System.out.print(i+"\t");
            //换行
            if (count%5 == 0){
                System.out.println();
            }
            count++;
            sum += i;
        }
        //打印和
        System.out.println();
        System.out.println("数据之和为:"+sum);
    }
}
