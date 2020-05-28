package org.sjy;

import java.util.Scanner;

/**
 * @ClassName TestIf
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class TestIf3 {
    public static void main(String[] args){
//     学校举行运动会，百米赛跑跑入10 秒内的学生有资格进决赛，根据性别分别进入男子组和女子组

        //输入对象
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入赛跑时间（s)：");
        int time=scanner.nextInt();

        //入10 秒内的学生有资格进决赛
        if(time<10){
            System.out.println("进决赛");

            ///////////////////////////////
            //根据性别分别进入男子组和女子组
            System.out.print("输入性别：");
            String sex =scanner.next();

            //判断
            if("男".equals(sex)){
                System.out.println("进入男子组!");
            }else if("女".equals(sex)){
                System.out.println("进入女子组!");
            }
            /////////////////////////////////////

        }else{
            System.out.println("淘汰!");
        }


    }
}
