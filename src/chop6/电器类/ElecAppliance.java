package chop6.电器类;

/**
 * 家用电器。
 */
public abstract class ElecAppliance {
    private int power = 50; // 功率
    private int voltage = 220; // 额定电压
    private int current = 5; // 额定电流
    private String currType = "交流"; // 交直流类型

    /**
     * 有参构造方法。
     * @param power 功率
     * @param voltage 额定电压
     * @param current 额定电流
     * @param currType 交直流类型
     */
    public ElecAppliance(int power, int voltage, int current, String currType) {
        this.power = power;
        this.voltage = voltage;
        this.current = current;
        this.currType = currType;
    }
    /**
     * 电器工作。
     */
    public abstract void work();
    /**
     * 获取额定电流
     * @return 额定电流
     */
    public int getCurrent() {
        return current;
    }
    /**
     * 获取功率。
     * @return 功率。
     */
    public int getPower() {
        return power;
    }
    /**
     * 获取额定电压。
     * @return 额定电压
     */
    public int getVoltage() {
        return voltage;
    }
    /**
     * 获取交直流类型。
     * @return 交直流类型
     */
    public String getCurrType() {
        return currType;
    }
}