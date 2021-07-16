package chop6.猫和鸭类;

/**
 * 猫类，动物类的子类。
 */
public class Cat extends Animal {
    /**
     * 构造方法。
     * @param name  名字
     * @param legNum   腿的条数
     */
    public Cat(String name, int legNum) {
        super(name, legNum);
    }
    /**
     * 重写父类的shout()方法。
     */
    public void shout() {
        System.out.println("喵喵喵……");
    }
}

