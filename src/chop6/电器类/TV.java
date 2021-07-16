package chop6.电器类;

public class TV extends ElecAppliance {
    private String type; // 电视种类
    private int volume; // 最大音量
    /**
     * 有参构造方法。
     * @param power   功率
     * @param voltage   额定电压
     * @param current  额定电流
     * @param currType  交直流类型
     * @param type  电视种类
     * @param volume  最大音量
     */
    public TV(int power, int voltage, int current, String currType,
              String type, int volume) {
        super(power, voltage, current, currType);
        this.type = type;
        this.volume = volume;
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.sg.ElecAppliance#work()
     */
    public void work() {
        System.out.println("电视在工作");
        System.out.println("这台电视的功率是 " + this.getPower());
        System.out.println("这台电视的额定电压是 " + this.getVoltage());
        System.out.println("这台电视的额定电流是 " + this.getCurrent());
        System.out.println("这台电视的交直流类型是 " + this.getCurrType());
        System.out.println("这台电视的种类是 " + this.getType());
        System.out.println("这台电视的最大音量是 " + this.getVolume());
    }
    /**
     * 获取电视种类。
     * @return 电视种类
     */
    public String getType() {
        return type;
    }
    /**
     * 获取最大音量。
     * @return 最大音量
     */
    public int getVolume() {
        return volume;
    }
}
