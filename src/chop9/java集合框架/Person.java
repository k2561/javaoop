package chop9.java集合框架;

/**
 * 使用throw在方法内抛出异常。
 */
public class Person {
    private String name = "";// 姓名
    private int age = 0;// 年龄
    private String sex = "男";// 性别

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public Person() {
    }

    /**
     * 设置性别。
     * @param sex 性别
     * @throws Exception
     */
    public void setSex(String sex) throws Exception {
        if ("男".equals(sex) || "女".equals(sex))
            this.sex = sex;
        else {
            throw new Exception("性别必须是“男”或者“女”！");
        }
    }
    /**
     * 打印基本信息。
     */
    public void print() {
        System.out.println(this.name + "（" + this.sex
                + "，" + this.age + "岁）");
    }
}
