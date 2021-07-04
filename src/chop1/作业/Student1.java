package chop1.作业;


/**
 * 学生类。
 */
class Student1 {
    private String name;// 姓名
    private int age; // 年龄
    /**
     * 获取姓名。
     * @return 姓名
     */
    public String getName() {
        return name;
    }
    /**
     * 设置姓名。
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取年龄。
     * @return 年龄
     */
    public int getAge() {
        return age;
    }
    /**
     * 设置年龄，加入判断逻辑。
     * @param age 年龄
     */
    public void setAge(int age) {
        if (age < 16) {
            System.out.println("错误！您还不符合最小年龄要求！");
        }
        this.age = age;
    }

    /**
     * 自我介绍。
     * @return 自我介绍信息
     */
    public String introduction() {
        return "大家好！我是" + name + "，我今年" + age + "岁";
    }
}
