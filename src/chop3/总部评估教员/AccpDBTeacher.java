package chop3.总部评估教员;

/**
 *Sql Server教员
 */
public class AccpDBTeacher extends AccpTeacher {
    public AccpDBTeacher(String myName, String mySchool) {
        super(myName, mySchool); //调用父类的构造方法
    }
    public void giveLesson(){
        System.out.println("启动Sql Server");
        System.out.println("知识点讲解。");
        System.out.println("总结提问。");
    }
}