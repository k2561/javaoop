package chop4.Mode;

/**
 * 测试
 */
public class MoheMain {
    public static void main(String[] args) {
        //彩色
       Mohe mohe=new CaiseMohe();
       //A4
       Zhizhang zhizhang=new A4Zhizhang();
       //打印
       DaYinJi daYinJi=new DaYinJi();
       daYinJi.print(mohe,zhizhang);
       //使用黑白墨盒在A4纸上打印
       mohe=new HeiBaiMohe();
       daYinJi.print(mohe,zhizhang);
        //使用黑白墨盒在B5纸上打印
        zhizhang=new B5();
        daYinJi.print(mohe,zhizhang);
    }
}
