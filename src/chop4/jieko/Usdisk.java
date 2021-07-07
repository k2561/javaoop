package chop4.jieko;

/**
 * 实现接口
 * 必须实现接口的所有方法
 */
public class Usdisk implements UsbIndetface{
    //实现服务
    @Override
    public void service() {
        System.out.println("U盘可以正常工作");
    }
}
