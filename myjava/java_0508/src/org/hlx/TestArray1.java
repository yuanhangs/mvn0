package org.hlx;

/**
 * @ClassName TestArray1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class TestArray1 {

    public static void main(String[] args) {
        //int[]数组默认是0；
        //String[]数组默认是null;
        //1.声明数组
//        int[] arrs;
        int arrs[];

        //2.开辟数组大小
        arrs=new int[3];

        System.out.println(arrs[0]+"\t"+arrs[1]+"\t"+arrs[2]);

        //3.赋值
        arrs[0]=10;
        arrs[1]=20;
        arrs[2]=30;
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        //数组大小是固定的！！！！
//        arrs[4]=40;

        System.out.println(arrs[0]+"\t"+arrs[1]+"\t"+arrs[2]);
    }
}
