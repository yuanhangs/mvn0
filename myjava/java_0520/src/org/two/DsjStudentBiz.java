package org.two;

/**
 * @ClassName DsjStudentBiz
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class DsjStudentBiz {

    /**
     *
     * @param student  一个对象
     */
    public void display(DsjStudent student){
        student.score+=10;
        student.show();
    }

//    使用学员对象数组作为参数，实现学员成绩修改
//    如果学员成绩小于60，集体提高2分
    public void update(DsjStudent[] students){
        //循环
        for (int i = 0; i <students.length ; i++) {
           //判断成绩小于60，集体提高2分
            if(students[i].score<60){
                students[i].score+=2;
            }
        }
    }

    /**
     * 显示所有的数据
     * @param students
     */
    public void all(DsjStudent[] students){
        for (DsjStudent stu:students){
            stu.show();
        }

    }


}
