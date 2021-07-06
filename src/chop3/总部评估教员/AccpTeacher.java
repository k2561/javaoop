package chop3.总部评估教员;

/**
 *教师
 */
public abstract class AccpTeacher {
    private String name;	// 教员姓名
    private String school;	// 所在中心
    /**
     * 有参构造方法。
     * @param name 教员姓名
     * @param school 所在中心
     */
    public AccpTeacher(String name, String school) {
        this.name = name;
        this.school = school;
    }
    /**
     * 教员授课。
     */
    public abstract void giveLesson();
    /**
     * 自我介绍。
     */
    public void introduction() {
        System.out.println("大家好！我是"+ school + "的" + name + "。");
    }
}

