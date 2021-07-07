package chop4.jiashu;

/**
 * 家书接口。
 */
public interface HomeLetter {

    /**
     * 书写称谓。
     */
    public void writeTitle();
    /**
     * 书写问候。
     */
    public void writeHello();
    /**
     * 书写内容。
     */
    public void writeBody();
    /**
     * 书写祝福。
     */
    public void writeGreeting();
    /**
     * 书写落款。
     */
    public void writeSelf();
}
