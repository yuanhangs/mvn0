package org.hlx.item;

import java.util.Scanner;

/**
 * @ClassName OrderMenu
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/13
 * @Version V1.0
 **/
public class OrderMenu3 {

    public static void main(String[] args) {

        //键盘输入对象
        Scanner scanner = new Scanner(System.in);

        //初始化-显示三个菜单序号、名称、单价、点赞数
        String[] menus = {"红烧带鱼", "鱼香肉丝", "时令鲜蔬"};
        double[] prices = {38.0, 20.0, 10.0};
        double[] counts = {0, 0, 0};


        //数组大小//
        int size = 10;
        ////////////

        //份数
        int[] numbers = new int[]{2, 2, 0, 0, 0, 0, 0, 0, 0, 0};
        //初始化-人员信息-订餐人姓名、订餐信息（菜品名和份数）、送餐时间、送餐地址、 状态（已预定或已完成）
        String[] names = new String[size];
        names[0] = "李成杰";
        names[1] = "余伟";

        //订餐信息
        String[] infos = new String[size];
        infos[0] = menus[0] + " " + numbers[0];
        infos[1] = menus[1] + " " + numbers[1];

//        送餐时间
        int[] dates = new int[size];
        dates[0] = 3;
        dates[1] = 10;

//        送餐地址
        String[] address = new String[size];
        address[0] = "天成路207号";
        address[1] = "莫邪路111号";

        // 状态 -->已预定0或已完成1
        int[] states = new int[size];
        states[0] = 1;
        states[1] = 0;


        //
//        boolean flagAccpect=false;

        //循环
        do {
            System.out.println("欢迎使用吃货联盟订餐系统");
            System.out.println("****************************");
            System.out.println("1、我要订餐");
            System.out.println("2、查看餐袋");
            System.out.println("3、签收订单");
            System.out.println("4、删除订单");
            System.out.println("5、我要点赞");
            System.out.println("6、退出系统");
            System.out.println("****************************");
            System.out.print("请选择:");
            int choose = scanner.nextInt();
            //分支
            switch (choose) {
                case 1:
                    System.out.println("***我要订餐***");
                    //姓名
                    System.out.print("请输入订餐人姓名：");
                    String name = scanner.next();

                    //菜列表
                    System.out.println("序号\t\t菜名\t\t单价");
                    for (int i = 0; i < menus.length; i++) {
                        System.out.println((i + 1) + "\t" + menus[i] + "\t" + prices[i] + "元");
                    }

                    //菜品编号
                    System.out.print("请选择您要点的菜品编号:");
                    int num = scanner.nextInt();

                    //根据菜品编号来获得菜名
                    String menu = menus[num - 1];
                    double price = prices[num - 1];


                    //份数
                    System.out.print("请选择您需要的份数:");
                    int count = scanner.nextInt();


                    //餐费
                    double total = price * count;

//               送餐费：当单笔订单金额达到 50 元时，免送餐费，否则，需交纳 6 元送餐费
                    //运费
                    double run = (total >= 50) ? (0) : (6);

                    //总计
                    double allTotal = total + run;

                    //时间
                    System.out.print("请输入送餐时间（送餐时间是10点至20点间整点送餐）:");
                    int time = scanner.nextInt();

                    //地址
                    System.out.print("请输入送餐地址：");
                    String addr = scanner.next();

                    //存入数组中
                    for (int i = 0; i < names.length; i++) {
                        //判断是为空
                        if (names[i] == null) {
                            names[i] = name;
                            infos[i] = menu + " " + count;
                            numbers[i] = count;  //份数
                            dates[i] = time;  //时间
                            address[i] = addr;
                            states[i] = 0;  //默认预定
                            break;  //退出循环
                        }
                    }

                    System.out.println("订餐成功！");
                    System.out.println("送餐时间\t菜名\t数量\t餐费\t运费\t总计");
                    System.out.println(time + "\t\t" + menu + "\t" + count + "\t" + total + "\t" + run + "\t" + allTotal);
                    break;
                case 2:
                    System.out.println("***查看餐袋***");
                    System.out.println("序号\t\t订餐人\t\t餐品信息\t\t送餐日期\t\t送餐地址\t\t总金额\t\t订单状态");
                    //循环
                    for (int i = 0; i < names.length; i++) {

                        //判断不能为空
                        if (names[i] != null) {

                            //1)状态 -->已预定0或已完成1
                            String state = (states[i] == 0) ? ("已预定") : ("已完成");

                            //价格
                            double price1 = 0;

                            //2)餐品信息-->红烧带鱼 2份
                            String[] strings = infos[i].split(" ");
                            if (strings[0].equals("红烧带鱼")) {
                                price1 = 38;
                            } else if (strings[0].equals("鱼香肉丝")) {
                                price1 = 20;
                            } else if (strings[0].equals("时令鲜蔬")) {
                                price1 = 10;
                            }
                            //3)总金额
                            double sum = numbers[i] * price1;
                            //4)显示
                            System.out.println((i + 1) + "\t\t" + names[i] + "\t\t" + infos[i] + "份\t\t" + dates[i] + "时\t\t" + address[i] + "\t\t" + sum + "元\t\t" + state);
                        }
                    }
                    break;
                case 3:
                    //签收标识
                    boolean flagAccpect = false;
                    System.out.println("***签收订单***");
                    System.out.println("请选择要签收的订单序号：");
                    num = scanner.nextInt();
                    //??
                    //循环查找
                    for (int i = 0; i < names.length; i++) {
                        //
                        if (i == num - 1) {
                            //判断菜名不能为空！
                            if (names[i] != null && states[i] == 0) {
                                //修改状态为1；
                                states[i] = 1;
                                System.out.println("订单签收成功！");
                                flagAccpect = true;  //改变标识
                            } else if (names[i] != null && states[i] == 1) {
                                System.out.println("您选择的订单已完成签收，不能再次签收！");
                                flagAccpect = true;
                            }
                        }
                    }
                    //判断
                    if (!flagAccpect) {
                        System.out.println("您选择的订单不存在！");
                    }
                    break;
                case 4:
                    //签收标识
                    boolean flagDelete = false;
                    System.out.println("***删除订单***");
                    System.out.println("请输入要删除的订单序号");
                    num = scanner.nextInt();
                    //循环查找
                    for (int i = 0; i < names.length; i++) {
                        //
                        if (i == num - 1) {
                            //判断菜名不能为空！
                            if (names[i] != null && states[i] == 0) {
                                System.out.println("您选择的订单未签收，不能删除!");
                                flagDelete = true;
                            } else if (names[i] != null && states[i] == 1) {

                                //移位置:从删除位置后一个元素开始每个元素依次前移一位
                                for (int j = num - 1; j < names.length - 1; j++) {
                                    names[j] = names[j + 1];
                                    infos[j] = infos[j + 1];
                                    dates[j] = dates[j + 1];
                                    address[j] = address[j + 1];
                                    states[j] = states[j + 1];
                                    //
                                }
                             // 将最后一个元素置为空
                                names[names.length - 1] = null;
                                infos[names.length - 1] = null;
                                dates[names.length - 1] = 0;
                                address[names.length - 1] = null;
                                states[names.length - 1] = 0;
                                flagDelete = true;
                                System.out.println("删除订单成功！");
                            }
                        }

                    }
                    //判断
                    if (!flagDelete) {
                        System.out.println("您要删除的订单不存在！");
                    }
                    break;
                case 5:   ////
                    System.out.println("***我要点赞***");

                    break;
                case 6:
                default:
                    System.out.println("谢谢使用，欢迎下次光临！");
                    return;
            }
            //
//            System.out.print("输入0返回：");
//            choose = scanner.nextInt();
        }
        while (true);
    }


}
