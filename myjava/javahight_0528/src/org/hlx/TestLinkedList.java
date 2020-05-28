package org.hlx;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName TestLinkedList
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/28
 * @Version V1.0
 **/
public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("mike");
        list.add("your");
        list.add("dumb");

        System.out.println("-----------------");
        for (Object obj:list){
            System.out.print(obj+"" +
                    "\t");
        }

        list.addFirst("高航");
        list.addLast("郑者坤");
        System.out.println("\n-----------------");
        for (Object obj:list){
            System.out.print(obj+"" +
                    "\t");
        }
        list.removeFirst();
        list.removeLast();
        System.out.println("\n-----------------");
        for (Object obj:list){
            System.out.print(obj+"" +
                    "\t");
        }
    }
}
