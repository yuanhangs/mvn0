package org.hlx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName StudentBiz
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/28
 * @Version V1.0
 **/
public class StudentBiz {

    //集合对象
//    List list = new ArrayList();
      List list = new LinkedList();

    /**
     * 添加
     * @param student
     */
    public void add(Student student){
     list.add(student);
    }

    /**
     * 按对象删除
     * @param student
     */
    public void delete(Student student){
        list.remove(student);
    }

    /**
     * 查询所有数据
     *
     */
    public void all(){
        System.out.println("-------for循环-----------");
        for (int i = 0; i <list.size() ; i++) {
            Student stu =(Student)list.get(i);
            System.out.println(stu);
        }
        System.out.println("-------iterator迭代器-----------");
        //迭代器对象
        Iterator it = list.iterator();
        //是否有下一个
        while(it.hasNext()){
            System.out.println(it.next()); //获取值
        }

        System.out.println("-------foreach循环-----------");
        for(Object obj  :list){
            System.out.println(obj);
        }
    }

    /**
     * 是否包含
     * @param student
     * @return
     */
    public boolean find(Student student){
       return list.contains(student);
    }



}
