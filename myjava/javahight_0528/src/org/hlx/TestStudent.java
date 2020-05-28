package org.hlx;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName TestStudent
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/28
 * @Version V1.0
 **/
public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("mike", 20, "男");
        Student student2 = new Student("Steven", 18, "男");
        Student student3 = new Student("John", 17, "女");

        //业务对象
        StudentBiz biz = new StudentBiz();
        //添加
        biz.add(student1);
        biz.add(student2);
        biz.add(student3);

        //显示
        biz.all();

        biz.delete(student2);

        //显示
        biz.all();

        if (biz.find(student2)) {
            System.out.println("OK!");
        } else {
            System.out.println("NO");
        }

        System.out.println("不是空=》" + biz.list.isEmpty());

        //将集合转换成数组；
        Object[] objs = biz.list.toArray();
        for (Object obj : objs) {
            System.out.println(obj);
        }

        //将数组转换成集合；==》
        List list2 = Arrays.asList(18, 45, 67, 89);
        System.out.println("--------------");
        for (Object obj : list2) {
            System.out.print(obj + "\t");
        }

    }
}
