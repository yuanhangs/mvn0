package org.hlx;

/**
 * @ClassName TestDoor
 * @Description: TODO
 * @Author 44401
 * @Date 2020/5/26
 * @Version V1.0
 **/
public class TestDoor {
    public static void main(String[] args) {

       // Lock lock =new Lock();
        Door door =new Door();
        door.unlock();
        door.lock();
    }
}
