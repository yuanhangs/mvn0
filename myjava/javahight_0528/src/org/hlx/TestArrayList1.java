package org.hlx;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestArrayList1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/28
 * @Version V1.0
 **/
public class TestArrayList1 {
    public static void main(String[] args) {
        //创建集合对象
        List list= new ArrayList();
        //添加数据
        list.add('F');
        list.add(23);
        list.add(100.89);
        list.add(true);
        list.add("李斯特");
        //大小
        System.out.println(list.size());
        //获取最后一个值
        System.out.println(list.get(list.size()-1));
        //在1的位置添加地址
        list.add(1,"HZ");

        System.out.println("--------------");
        //显示数据
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        //删除23这个值
        list.remove(new Integer(23));
        //删除第一个值
        list.remove(0);

        //清空所有的数据
//        list.clear();

        //是否包含这个值
        System.out.println("contains=>"+list.contains(100.891));

        System.out.println("--------------");
        //显示数据
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }





    }
}
