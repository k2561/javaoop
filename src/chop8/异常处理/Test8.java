package chop8.异常处理;

/**
 * 捕获throw抛出的异常。
 */
public class Test8 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setSex("Male");
            person.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
