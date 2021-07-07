package chop4.jieko;

/**
 *
 */
public class UsbMain {
    public static void main(String[] args) {
        Usdisk usdisk =new Usdisk();
        usdisk.service();
        UsbFang usbFang=new UsbFang();
        usbFang.service();
        testusb();
    }
    //多态实现
    public  static void testusb(){
        System.out.println("多态实现接口");
      UsbIndetface usbIndetface=new Usdisk();
      usbIndetface.service();
    }
}
