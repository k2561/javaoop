package chop2.作业;

/**
 * 动物类，抽象类。
 */
abstract class Animal {
    private int age = 0;//年龄
    /**
     *  不带参数的构造方法。
     */
    public Animal() {

    }
    /**
     * 带参数的构造方法 。
     */
    public Animal(int age) {
        this.age = age;
    }
    /**
     * 获取年龄 。
     */
    public int getAge() {
        return age;
    }
    /**
     * 设置年龄。
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     *  用于获取信息的抽象方法。
     */
    public abstract void info();
}
