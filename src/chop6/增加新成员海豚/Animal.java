package chop6.增加新成员海豚;

/**
 * 动物抽象类。
 */
public abstract class Animal {
    private String name = null;// 名字

    /**
     * 有参构造方法。
     * @param name  名字
     */
    public Animal(String name) {
        this.name = name;
    }
    /**
     * 获得动物名字。
     * @return 名字
     */
    public String getName() {
        return name;
    }
    /**
     * 动物叫。
     */
    public abstract void shout();
}

