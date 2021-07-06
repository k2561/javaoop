package chop3.总部评估教员;

/**
 *Eclipse教员
 */
public class AccpJavaTeacher extends AccpTeacher {
    /**
     * 有参构造方法。
     * @param name 教员姓名
     * @param school 所在中心
     */
    public AccpJavaTeacher(String name, String school) {
        super(name, school); // 调用父类的构造方法
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.tg.abstr.AccpTeacher#giveLesson()
     */
    public void giveLesson() {
        System.out.println("启动 Eclipse");
        System.out.println("知识点讲解。");
        System.out.println("总结提问。");
    }
}
