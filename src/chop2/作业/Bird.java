package chop2.作业;

/**
 * 鸟类，继承自动物类。
 */
public class Bird extends Animal {
    private String color = "红色";//颜色
    /**
     * 有参数构造方法。
     */
    public Bird(int age, String color) {
        super(age);
        this.color = color;
    }
    /**
     * 获取颜色。
     */
    public String getColor() {
        return color;
    }
    /**
     * 设置颜色。
     */
    public void setColor(String color) {
        this.color = color;
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.homework.Animal#info()
     */
    public void info() {
        System.out.println("我是一只" + color + "的鸟！");
        System.out.println("今年" + this.getAge() + "岁了！");
        System.out.println();
    }
}
