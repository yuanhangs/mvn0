/**
 * @ClassName Home1
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/28
 * @Version V1.0
 **/
public class Home1 {
    public static void main(String[] args){
//       System.out.println("你好，我是杭丽霞");
//       System.out.println("XXXX");


        //5
//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j <5-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <5 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j <5-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <2*i+1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //1,3,5,7,9
//        for (int i = 5; i >0 ; i--) {
//            for (int j = 0; j <5-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <2*i-1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //9行
        for (int i = -4; i <=4 ; i++) {
            for (int j = 0; j <Math.abs(i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <9-2*Math.abs(i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
