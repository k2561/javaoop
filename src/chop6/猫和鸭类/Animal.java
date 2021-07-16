package chop6.猫和鸭类;

/**
 * 动物抽象类。
 */
public abstract class Animal {
    private String name = null;// 名字
    private int legNum = 0; //腿的条数
    /**
     * 有参构造方法。
     * @param name  名字
     * @param legNum 腿的条数
     */
    public Animal(String name, int legNum) {
        this.name = name;
        this.legNum = legNum;
    }
    /**
     * 获得动物名字。
     * @return 名字
     */
    public String getName() {
        return name;
    }
    /**
     * 获得动物腿的条数。
     * @return 腿的条数
     */
    public int getLegNum() {
        return legNum;
    }
    /**
     * 动物叫。
     */
    public abstract void shout();

}
