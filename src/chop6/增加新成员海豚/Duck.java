package chop6.增加新成员海豚;

/**
 * 鸭类，动物类的子类，实现陆生接口。
 */
public class Duck extends Animal implements Terrestrial {
    private int legNum = 0; // 腿的条数
    /**
     * 构造方法。
     * @param name 名字
     * @param legNum 腿的条数
     */
    public Duck(String name,int legNum) {
        super(name);
        this.legNum = legNum;
    }
    /**
     * 重写父类的shout()方法。
     */
    public void shout() {
        System.out.println("嘎嘎嘎……");
    }
    /**
     * 实现接口的getLegNum()方法。
     * @return 腿的条数
     */
    public int getLegNum() {
        return legNum;
    }
}

