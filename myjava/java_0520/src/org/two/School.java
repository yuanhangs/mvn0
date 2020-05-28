package org.two;

/**
 * @ClassName School
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class School {

    //声明数组
    String[] names = new String[6];

    /**
     * 添加学员姓名
     *
     * @param name
     */
    public void addName(String name) {
        //for循环
        for (int i = 0; i < names.length; i++) {
            //判断是否为空
            if (names[i] == null) {
               names[i]=name;  // 添加数据
                break;
            }
        }
    }

    /**
     * 显示数据
     */
    public void show(){
        //foreach(数据类型与数组类型一致 变量名：数组名)
        for (String str:names){
            //判断
            if(str!=null)
               System.out.print(str+"\t");
        }
        System.out.println();
    }


    /**
     * 查找学员姓名
     * @param start
     * @param end
     * @param name
     * @return
     */
    public boolean find(int start,int end ,String name){
        boolean flag=false;
        //循环
        for (int i = start-1; i <end ; i++) {
          //判断
            if(names[i].equalsIgnoreCase(name)){
                flag=true;
                break; //结束
            }
        }
        return flag;
    }

}
