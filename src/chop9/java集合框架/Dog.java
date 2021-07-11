package chop9.java集合框架;

/**
 * 宠物狗。
 */
public class Dog {
    private String name; // 昵称
    private int health = 100; // 健康值
    private int love = 10; // 亲密度
    private String strain; // 品种

    /**
     * 构造函数。
     * @param name 昵称
     * @param strain 品种
     */
    public Dog(String name, String strain) {
        this.name = name;
        this.strain = strain;
    }

    /**
     * 返回狗狗的昵称。
     * @return 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * 返回狗狗的健康值。
     * @return 健康值
     */
    public int getHealth() {
        return health;
    }

    /**
     * 返回狗狗和主人的亲密度。
     * @return 亲密度
     */
    public int getLove() {
        return love;
    }

    /**
     * 返回狗狗的品种。
     * @return 品种
     */
    public String getStrain() {
        return strain;
    }
}

