package org.hlx;

/**
 * @ClassName Numbers
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/21
 * @Version V1.0
 **/
public class Numbers {

    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public String add(String a, int b) {
        return (a + b);
    }
    public String add(int a, String b) {
        return (a + b);
    }
    protected double add(int a, double b) {
        return (a + b);
    }
    double add(int a, float b) {
        return (a + b);
    }

    int add(int a, byte b) {
        return (a + b);
    }
}
