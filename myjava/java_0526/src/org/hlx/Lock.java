package org.hlx;

public interface Lock {
    void unlock();

    public abstract void lock();  //public abstract 默认的可写可不写；

    int COUNT=100;  //常量;

    public static final String SEX="F";  //常量;可写可不写public static final
}

class Door implements Lock{

    @Override
    public void unlock() {
        System.out.println(Lock.COUNT);
        System.out.println("开锁!");
    }

    @Override
    public void lock() {
        System.out.println("上锁!");
    }
}

