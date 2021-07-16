package chop6.增加新成员海豚;

/**
 * 海豚类，动物类的子类。
 */
public class Dolphin extends Animal {
    /**
     * 构造方法。
     * @param name 名字
     */
    public Dolphin(String name) {
        super(name);
    }
    /**
     * 重写父类的shout()方法。
     */
    public void shout() {
        System.out.println("海豚音……");

    }
}
