package chop1.ACCP教员类;

//ACCP教员。

public class ACCPTeacher {
    private String name; // 姓名
    private int age; // 年龄
    private String degree; // 学位
    private String school; // 所在中心
    private String position; // 技术方向

    /**
     * 无参构造方法。
     */
    public ACCPTeacher() {
    }

    /**
     * 有参构造方法。
     * @param name  姓名
     * @param age  年龄
     * @param school  所在中心
     */
    public ACCPTeacher(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.degree = "硕士";
        this.school = school;
        this.position = "Java";
    }

    /**
     * 有参构造方法。
     * @param name   姓名
     * @param age    年龄
     * @param degree  学位
     * @param school    所在中心
     * @param position  技术方向
     */
    public ACCPTeacher(String name, int age, String degree, String school,
                       String position) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.school = school;
        this.setPosition(position);
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position.equals("Java") || position.equals(".NET")) {
            this.position = position;
        } else {
            this.position = "Java";
            System.out.println("技术方向只能是Java或.NET!");
        }
    }

    /**
     * 自我介绍。
     */
    public void introduce() {
        System.out.println("大家好，我是" + this.name + "，今年"
                + age + "岁，我的学历是"	+ degree + "，所在中心是"
                + school + "，技术方向是" + position + "。");
    }
}

