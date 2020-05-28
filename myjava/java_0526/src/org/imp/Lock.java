package org.imp;

/**
 * 锁接口
 */
public interface Lock {
    void unlock();

    public abstract void lock();  //public abstract 默认的可写可不写；
}

/**
 * 门
 */
abstract  class Door{
    public abstract void close();  //关
    public abstract void open();   //开
}


/**
 * 防盗门
 */
class TheftDoor extends  Door implements Lock {

    @Override
    public void unlock() {
        System.out.println("开锁!");
    }

    @Override
    public void lock() {
        System.out.println("上锁!");
    }

    @Override
    public void close() {
        System.out.println("关门");
    }

    @Override
    public void open() {
        System.out.println("开门");
    }
}

class TestTheftDoor{
    public static void main(String[] args) {
        TheftDoor door = new TheftDoor();
        door.close();
        door.lock();
        door.unlock();
        door.open();
    }
}
