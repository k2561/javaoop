package chop9.添加多个企鹅信息到List中;

/**
 * 宠物企鹅。
 */
public class Penguin {
    String name = "无名氏"; // 昵称
    int health = 100; // 健康值
    int love = 0; // 亲密度
    String sex = "Q仔"; // 性别

    /**
     * 两个参数构造方法。
     */
    public Penguin(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}