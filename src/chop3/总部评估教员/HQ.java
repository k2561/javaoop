package chop3.总部评估教员;

/**
 * 测试
 */
public class HQ {
    /*
     * 对教员进行评估，评估内容：自我介绍、授课
     */
    public void judge(AccpTeacher t){
        t.introduction();
        t.giveLesson();
    }
    /*
     * 使用main方法进行单元测试
     */
    public static void main(String[] args) {
        HQ hq = new HQ();
        hq.judge(new AccpJavaTeacher("李明","北京中心"));
        hq.judge(new  AccpDotNetTeacher("张明","天津中心"));
        hq.judge(new AccpDBTeacher("李岚","北京中心"));
    }
}