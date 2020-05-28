package org.hlx;

import java.rmi.server.ExportException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @ClassName Test1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/27
 * @Version V1.0
 **/
public class Test2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //声明数组
        int[] arrs=new int[2];
        try {

            //日期对象
            Date date=null;

            System.out.println(date.getTime());

            //有可能发生异常
            System.out.print("请输入被除数:");
//            int num1 = in.nextInt();
             String str = in.next();

            //字符串转换成int
            int num1 = Integer.parseInt(str);

//            arrs[2]=num1;

            System.out.print("请输入除数:");
            int num2 = in.nextInt();

            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);

        }catch (ArithmeticException ex){ //处理异常
            ex.printStackTrace();  //异常类型，具体哪个类哪个方法哪个位置；
        }catch (ArrayIndexOutOfBoundsException ex){  //子类
            ex.printStackTrace();
        }catch(InputMismatchException ex){
            ex.printStackTrace();
        }catch (NumberFormatException ex){
            ex.printStackTrace();
        }catch (Exception ex){  //父类
            ex.printStackTrace();
        }
        finally {
            System.out.println("执行！！！");
        }

        System.out.println("感谢使用本程序！");

    }
}
