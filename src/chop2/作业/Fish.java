package chop2.作业;


/**
 * 鱼类，继承自动物类。
 *
 */
public class Fish extends Animal {
    private int weight = 4;//重量
    /**
     * 带参数的构造方法。
     */
    public Fish(int age, int weight) {
        super(age);
        this.weight = weight;
    }
    /**
     * 获取重量。
     */
    public int getWeight() {
        return weight;
    }
    /**
     * 设置重量。
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.homework.Animal#info()
     */
    public void info() {
        System.out.println("我是一只" + weight + "斤重的鱼！");
        System.out.println("今年" + this.getAge() + "岁了！");
        System.out.println();
    }
}

