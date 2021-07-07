package chop4.jiashu;

/**
 * 测试类。
 */
public class Test {

    public static void main(String[] args) {
        //1、创建家书对象
        HomeLetter letter = new HomeLetterImpl();
        //2、书写家书
        HomeLetterWriter.write(letter);
    }
}
