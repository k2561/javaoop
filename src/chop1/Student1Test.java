package chop1;


/**
 *  测试类。
 *
 */
public class Student1Test {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setName("张三");
        s.setAge(10);
        System.out.println(s.introduction());
    }

}