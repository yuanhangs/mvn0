package org.hlx;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName TestSet
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/28
 * @Version V1.0
 **/
public class TestSet {
    public static void main(String[] args) {
        Set set = new HashSet();
//        Set set = new TreeSet();
        set.add("aaa");
        set.add("ccc");
        set.add("aaa");
        System.out.println(set.size());



        //
        for (Object obj:set){
            System.out.println(obj);
        }
    }
}
