package org.hlx;

/**
 * @ClassName TestArray2
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class TestArray2 {

    public static void main(String[] args) {
//        数据类型[ ]  数组名   =   new   数据类型[大小]  ;

        //声明数组的同时开辟大小
        String[]  names =new String[5];
        System.out.println(names[0]+"\t"+names[1]+"\t"+names[2]+"\t"+names[3]+"\t"+names[4]);

        names[0]="郑远展";
        System.out.println(names[0]+"\t"+names[1]+"\t"+names[2]+"\t"+names[3]+"\t"+names[4]);
    }
}
