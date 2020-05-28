package org.hlx;

/**
 * @ClassName TestShap1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/11
 * @Version V1.0
 **/
public class TestShap1 {
    public static void main(String[] args) {
        //1层循环
//        for (int i = 0; i <5 ; i++) {
//            System.out.println("*****");
//        }

      //  star();
//        star2();
//        star3();
//        star4();
//        star5();
        nine();

    }


    public static void nine(){
        //2层循环
        //外层循环是行数 9
        for (int i = 1; i<=9 ; i++) {

            //内层循环个数 1,2,3
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            //换行
            System.out.println();
        }
    }


    /**
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     */
    public static void star5(){
        //2层循环
        //外层循环是行数 9
        for (int i = -4; i<=4 ; i++) {

            //空格432101234
            for (int j = 0; j <Math.abs(i) ; j++) {
                System.out.print(" ");
            }
            //内层循环是*个数135797531
            for (int j = 0; j <9-2*Math.abs(i) ; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }


    /**
     * 方法
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     */
    public static void star4(){
        //2层循环
        //外层循环是行数 5
        for (int i = 5; i>0 ; i--) {

            //空格43210
            for (int j = 0; j <5-i ; j++) {
                System.out.print(" ");
            }
            //内层循环是*个数97531
            for (int j = 0; j <2*i-1 ; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }


    /**
     * 方法
     *      *
     *     ***
     *    *****
     *   *******
     *  *********
     */
    public static void star3(){
        //2层循环
        //外层循环是行数 5
        for (int i = 0; i <5 ; i++) {

            //空格43210
            for (int j = 0; j <5-i ; j++) {
                System.out.print(" ");
            }
            //内层循环是*个数13579
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }


    /**
     * 方法
     */
    public static void star2(){
        //2层循环
        //外层循环是行数 5
        for (int i = 0; i <5 ; i++) {

            //空格43210
            for (int j = 0; j <5-i ; j++) {
                System.out.print(" ");
            }
            //内层循环是*个数
            for (int j = 0; j <5 ; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }


    /**
     * 方法
     */
    public static void star(){
        //2层循环
        //外层循环是行数 5
        for (int i = 0; i <5 ; i++) {
            //内层循环是*个数
            for (int j = 0; j <5 ; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
