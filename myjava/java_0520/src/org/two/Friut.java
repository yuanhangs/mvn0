package org.two;

/**
 * @ClassName Friut
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class Friut {

    /**
     *
     * @param fruit  ：哪一个水果
     * @return   哪一个水果汁
     */
    public String zha(String fruit){
        return fruit+"汁";
    }

    /**
     *
     * @param fruit
     * @param count
     * @return
     */
    public String zha(String fruit,int count){
        return count+"杯=》"+fruit+"汁";
    }

}
