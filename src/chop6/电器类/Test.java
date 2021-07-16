package chop6.电器类;

/**
 * 测试类。
 */
public class Test {
    public static void main(String[] args) {
        //电视机工作
        ElecAppliance tv = new TV(100,220,50,"交流","长虹",200);
        tv.work();
        //电冰箱工作
        ElecAppliance icebox = new Icebox(110,220,53,"交流",252);
        icebox.work();
    }
}
