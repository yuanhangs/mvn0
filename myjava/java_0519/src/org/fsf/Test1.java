package org.fsf;

/**
 * @ClassName:Test
 * @Description:
 * @Author:付世峰
 * @Date:14:32 2020/5/18
 * @Version:1.0
 */
public class Test1 {
    /**
     * 编写一个java程序，实现输出1-50中所有不能被7整除的数,并求其和。
     * 要求：每输出5个数据换行显示
     * @param args
     */
    public static void main(String[] args) {
        //数据索引
        int index=0;
        //总和
        int sum=0;
        //循环1-50
        for (int i = 1; i <51 ; i++) {
            //数字为7的倍数则跳过本次循环执行下次循环
            if (i%7==0){
                continue;
            }
            //索引自加
            index++;
            //输出每次的值
            System.out.print(i+"\t");
            //累加数据
            sum+=i;
            //每五个换行
            if (index%5==0){
                System.out.println();
            }
        }
        System.out.println("\n数据之和为："+sum);
    }
}
