package chop6.电器类;

public class Icebox extends ElecAppliance {
    private double capability; // 容量
    /**
     * 有参构造方法。
     * @param power  功率
     * @param voltage  额定电压
     * @param current  额定电流
     * @param currType  交直流类型
     * @param capability  容量
     */
    public Icebox(int power, int voltage, int current, String currType,
                  double capability) {
        super(power, voltage, current, currType);
        this.capability = capability;
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.sg.ElecAppliance#work()
     */
    public void work() {
        System.out.println("冰箱在工作");
        System.out.println("这台冰箱的功率是 " + this.getPower());
        System.out.println("这台冰箱的额定电压是 " + this.getVoltage());
        System.out.println("这台冰箱的额定电流是 " + this.getCurrent());
        System.out.println("这台冰箱的交直流类型是 " + this.getCurrType());
        System.out.println("这台冰箱的容量是 " + this.getCapability());
    }
    /**
     * 获取容量。
     * @return 容量。
     */
    public double getCapability() {
        return capability;
    }
}

