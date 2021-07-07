package chop4.jieko;

/**
 *测试
 */
public class UsbMain {
    public static void main(String[] args) {
        Usdisk usdisk =new Usdisk();
        usdisk.service();
        UsbFang usbFang=new UsbFang();
        usbFang.service();
        testusb();
    }
    //多态实现接口
    public  static void testusb(){
        System.out.println("多态实现接口");
        UsbIndetface usbIndetface=new Usdisk();
        usbIndetface.service();
        UsbIndetface usbIndetface1=new UsbFang();
        usbIndetface1.service();
        UsbIndetface deng=new UsbDeng();
        deng.service();
    }
}
