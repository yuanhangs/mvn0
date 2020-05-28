package org.hlx;

/**
 * @ClassName TestPop
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/12
 * @Version V1.0
 **/
public class TestPop {

    public static void main(String[] args) {
        //数组
        int[] arrs ={16,25,9,90,23,2,78};
        //原数组
        for (int i = 0; i <arrs.length ; i++) {
            System.out.print(arrs[i]+"\t");
        }

        //冒泡排序(升序)
        //外层循环： 轮数 N-1
        for (int i = 0; i <arrs.length-1 ; i++) {
            //内层循环: 比较的次数 4321
            for (int j = 0; j <arrs.length-1-i ; j++) {
               //判断
                if(arrs[j]> arrs[j+1]){
                    //降序
//                if(arrs[j]<arrs[j+1]){
                    //交换数据
                    int temp = arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]=temp;
                }
            }
        }

        System.out.println();
        //输出排序后的数据
        //foreach循环 (对应数组的类型 任意取变量名：数组名)
        //就是循环
        for (int arr:arrs){
            System.out.print(arr+"\t");
        }

    }
}
