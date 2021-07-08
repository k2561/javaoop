package chop8.异常处理;

/**
 * 测试学生
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("王五");
        try {
            student.setAge(12);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            student.setSex("男生");
            //只能捕获一个异常
            //student.setAge(12);
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
        student.show();
    }
}
