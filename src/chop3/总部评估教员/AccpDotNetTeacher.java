package chop3.总部评估教员;

/**
 * Visual studio 2005教员
 */
public class AccpDotNetTeacher extends AccpTeacher {
    /**
     * 有参构造方法。
     * @param name 教员姓名
     * @param school 所在中心
     */
    public AccpDotNetTeacher(String name, String school) {
        super(name, school); // 调用父类的构造方法
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.tg.abstr.AccpTeacher#giveLesson()
     */
    public void giveLesson() {
        System.out.println("启动Visual studio 2005。");
        System.out.println("知识点讲解。");
        System.out.println("总结提问。");
    }
}
