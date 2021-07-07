package chop4.jiashu;

/**
 * 家书写手。
 */
public class HomeLetterWriter {
    /**
     * 按照约定格式书写家书。
     */
    public static void write(HomeLetter letter){
        letter.writeTitle();
        letter.writeHello();
        letter.writeBody();
        letter.writeGreeting();
        letter.writeSelf();
    }
}
