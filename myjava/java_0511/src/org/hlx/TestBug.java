package org.hlx;

/**
 * @ClassName TestBug
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/11
 * @Version V1.0
 **/
public class TestBug {

    public static void main(String[] args) {
        int i = 1;
        System.out.println("程序调试演示，注意观察i的值：");
        aa();
        while(i < 5){
            System.out.println(i);
            i++;
        }

    }

    private static void aa() {

        for (int i = 0; i <3 ; i++) {
            System.out.println(i);
        }
    }
}
