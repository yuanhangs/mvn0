package org.hlx;

import java.util.Arrays;

/**
 * @ClassName TestArrays
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/12
 * @Version V1.0
 **/
public class TestArrays {

    public static void main(String[] args) {
//        getSort();

//        getEquals();

//        getToString();

//        getFill();
//        getCopyOf();

         getBinarySearch();
    }

    /**
     *  **查询元素值val在数组array中的下标（要求数组中元素已经按升序排列）
     */
    private static void getBinarySearch() {
         int[] arrs1 ={16,25,9,90,23,2,78};
         //升序排列
         Arrays.sort(arrs1);
         System.out.println( Arrays.toString(arrs1));

         //第一个参数：数组； 第二个参数：要查找的值；
//        int index=Arrays.binarySearch(arrs1,16);
//        int index=Arrays.binarySearch(arrs1,78);
        //如果找不到，返回指定插入值的索引-位置
        int index=Arrays.binarySearch(arrs1,10);
        System.out.println("查找16这个数据的下标："+index); //-3

    }
    /**
     * 将数组拷贝一个新数组
     */
    private static void getCopyOf() {
        int[] arrs1 ={16,25,9,90,23,2,78};
        //第一个参数:是要复制的数组; 第二个参数是:新数组的大小;
        int[]  arrsNew=Arrays.copyOf(arrs1,arrs1.length+5);
        System.out.println( Arrays.toString(arrs1));
        System.out.println( Arrays.toString(arrsNew));
    }


    /**
     * 将数组中的所有值替换成当前这个值100
     */
    private static void getFill() {
        int[] arrs1 ={16,25,9,90,23,2,78};
        Arrays.fill(arrs1,100);
        System.out.println( Arrays.toString(arrs1));
    }


    /**
     * 将XXX类型的数组转成字符串
     */
    private static void getToString() {
        int[] arrs1 ={16,25,9,90,23,2,78};
        //将整数的数组转成字符串
        System.out.println( Arrays.toString(arrs1));
    }


    /**
     * 字符串数组比较！！==》
     */
    private static void getEquals() {
        int[] arrs1 ={16,25,9,90,23,2,78};
        int[] arrs2 ={16,25,9,90,23,2,78};
        int[] arrs3 ={16,25,9,90,23};
        //比较数组的值相等
        System.out.println( Arrays.equals(arrs1,arrs2));
        System.out.println( Arrays.equals(arrs2,arrs3));
    }


    private static void getSort() {
        //数组
        int[] arrs ={16,25,9,90,23,2,78};

        //原数组
        for (int i = 0; i <arrs.length ; i++) {
            System.out.print(arrs[i]+"\t");
        }
        //排序(默认升序)
        Arrays.sort(arrs);
        System.out.println("\n---升序---");
        for (int arr: arrs){
            System.out.print(arr+"\t");
        }

        //降序？？？
        System.out.println("\n---降序---");
        for (int i =arrs.length-1 ; i >=0 ; i--) {
            System.out.print(arrs[i]+"\t");
        }
    }
}
