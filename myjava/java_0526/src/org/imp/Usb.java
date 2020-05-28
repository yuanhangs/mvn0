package org.imp;

/**
 * usb接口
 */
public interface Usb {
    public void data();
}

class Fan implements  Usb{

    @Override
    public void data() {
        System.out.println("风扇在转！！");
    }
}

class Mouse implements  Usb{

    @Override
    public void data() {
        System.out.println("鼠标在动!！！");
    }
}

class TestUsb{
    public static void main(String[] args) {
        Usb usb=new Fan();
        usb.data();
        Usb usb2=new Mouse();
        usb2.data();
    }
}