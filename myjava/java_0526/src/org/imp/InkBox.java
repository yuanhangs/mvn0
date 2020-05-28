package org.imp;

import java.util.regex.Pattern;

/**
 * @ClassName InkBox
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/26
 * @Version V1.0
 **/
public interface InkBox {
 public String box();
}

class ColorBox implements  InkBox{
    @Override
    public String box() {
        return "彩色墨盒";
    }
}

class BlackBox implements  InkBox{
    @Override
    public String box() {
        return "黑白墨盒";
    }
}

interface Paper {
    public String size();
}

class PaperA4 implements  Paper{

    @Override
    public String size() {
        return "A4";
    }
}

class PaperB5 implements  Paper{
    @Override
    public String size() {
        return "B5";
    }
}


/**
 * 打印机
 */
class Printer {
    //方法
      public void print(InkBox box, Paper paper){
          System.out.println(box.box()+"打印在"+paper.size());
      }
}

class  TestPrinter{
    public static void main(String[] args) {
        InkBox box=new ColorBox();
        Paper paper =new PaperA4();

        InkBox box2=new BlackBox();
        Paper paper2 =new PaperB5();

        //打印机对象
        Printer printer =new Printer();
        printer.print(box,paper);
        printer.print(box2,paper2);
    }
}