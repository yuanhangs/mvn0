package org.hlx;

/**
 * @ClassName TestArray2
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class TestArray3 {

    public static void main(String[] args) {
//        数据类型[ ]  数组名   =   new   数据类型[大小]  ;

        //声明数组的同时初始化数组
//        String[]  names =new String[]{"郑远展","mike","john","Steven","solr"};
        String[]  names ={"郑远展","mike","john","Steven","solr","your"};

        //数组中的length是属性!!!!
        int length =names.length;

        System.out.println("数组的大小："+length);

        System.out.println(names[0]+"\t"+names[1]+"\t"+names[2]+"\t"+names[3]+"\t"+names[4]);
    }
}
