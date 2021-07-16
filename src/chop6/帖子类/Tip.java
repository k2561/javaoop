package chop6.帖子类;

/**
 * 帖子类。
 */
public abstract class Tip {
    private String title = "我是新手，请大家指教"; // 帖子标题
    private String content = "我刚开始学java，请大家指教"; // 帖子内容
    private String publishTime = "2010-1-1 10:30:16"; // 发表时间
    private int uid = 1; // 用户id,用来表示该帖子是哪个用户发表的
    /**
     * 无参构造方法。
     */
    public Tip() {
        title = "re:我是新手，请大家指教";
        content = "好的，我们一起学";
        publishTime = "2010-1-1 10:30:20";
    }
    /**
     * 有参构造方法。
     * @param title 帖子标题
     * @param content 帖子内容
     * @param publishTime 发表时间
     * @param uid 用户id
     */
    public Tip(String title, String content, String publishTime,int uid) {
        this.title = title;
        this.content = content;
        this.publishTime = publishTime;
        this.uid=uid;
    }
    /**
     * 输出当前帖子的信息。
     */
    public abstract void getInfo();
    /**
     * 获取帖子标题。
     * @return 帖子标题
     */
    public String getTitle() {
        return title;
    }
    /**
     * 获取帖子内容。
     * @return 帖子内容
     */
    public String getContent() {
        return content;
    }
    /**
     * 获取发表时间。
     * @return 发表时间
     */
    public String getPublishTime() {
        return publishTime;
    }
    /**
     * 获取用户id。
     * @return 用户id
     */
    public int getUid() {
        return uid;
    }
}

