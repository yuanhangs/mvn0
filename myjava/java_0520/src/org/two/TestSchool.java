package org.two;

import java.util.Scanner;

/**
 * @ClassName TestSchool
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class TestSchool {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        //实例化对象
        School school=new School();
        System.out.println("请输入姓名6个：");
        for (int i = 0; i <school.names.length ; i++) {
            //调用方法
            school.addName(scanner.next());
        }
        //显示
        school.show();

        //开始查找
        System.out.print("请输入开始位置：");
        int start=scanner.nextInt();
        System.out.print("请输入结束位置：");
        int end=scanner.nextInt();
        System.out.print("查找的名字：");
        String string=scanner.next();
        //调用方法
        boolean flag=school.find(start,end,string);
//        boolean flag=school.find(start,end);
        //判断
        String result = (flag)?("找到"):("没有找到！");

        System.out.println(result);


    }

    private static void my() {
        int[] numbers = {10, 20, 30};
        for (int num : numbers) {
            num++;//num=num+1;
            System.out.println(num);
        }
    }
}
