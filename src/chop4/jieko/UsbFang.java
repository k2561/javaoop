package chop4.jieko;

/**
 *风扇
 */
public class UsbFang implements UsbIndetface{

    @Override
    public void service() {
        System.out.println("风扇可以正常工作");
    }
}
