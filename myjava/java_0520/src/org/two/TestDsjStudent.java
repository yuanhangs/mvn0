package org.two;

/**
 * @ClassName TestDsjStudent
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/20
 * @Version V1.0
 **/
public class TestDsjStudent {
    public static void main(String[] args) {
//        one();

        //创建对象
        DsjStudent student1 =new DsjStudent();
        student1.score=89;

        DsjStudent student2 =new DsjStudent();
        student2.score=56;

        DsjStudent student3 =new DsjStudent();
        student3.score=55;

        //定义对象数组
        DsjStudent[]  students = new DsjStudent[3];
        //存入
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;

        //业务对象
        DsjStudentBiz biz=new DsjStudentBiz();
        //调用方法
        biz.update(students);

        biz.all(students);


    }

    private static void one() {
        //创建对象
        DsjStudent student =new DsjStudent();
        student.score=89;

        //业务对象
        DsjStudentBiz biz=new DsjStudentBiz();
        biz.display(student);
    }
}
