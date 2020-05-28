package org.sjy;

/**
 * @ClassName Test3
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/29
 * @Version V1.0
 **/
public class Test3 {

    /**
     * 优点：比较安全
     * 推荐做法：
     * （1）常量名通常大写
     * （2）不同字符使用下划线分隔
     * （3）只能被赋值一次，通常定义时即对其初始化
     * @param args
     */
    public static void main(String[] args) {
        //性别常量
        final  String SEX_MAN="男";
        final  String SEX_WOMAN="女";

        System.out.println(SEX_WOMAN);

    }
}
