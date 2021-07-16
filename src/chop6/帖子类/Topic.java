package chop6.帖子类;

/**
 * 主题类。
 */
public class Topic extends Tip {
    private int topicId = 1;  // 主题id
    private int boardId = 1;  // 板块id，用来表示该帖子是哪个板块的
    /**
     * 有参构造方法。
     * @param title 主题标题
     * @param content 主题内容
     * @param publishTime 发表时间
     * @param uid 用户id
     * @param topicId 主题id
     * @param boardId 板块id
     */
    public Topic(String title, String content, String publishTime, int uid,int topicId,int boardId) {
        super(title, content, publishTime, uid);
        this.topicId=topicId;
        this.boardId=boardId;
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.sg.Tip#getInfo()
     */
    public void getInfo(){
        System.out.println("====主题信息====");
        System.out.println("主题标题：" + this.getTitle());
        System.out.println("主题内容：" + this.getContent());
        System.out.println("发表时间：" + this.getPublishTime()+"\n");
    }
    /**
     * 获取主题id
     * @return 主题id
     */
    public int getTopicId() {
        return topicId;
    }
    /**
     * 获取板块id。
     * @return 板块id
     */
    public int getBoardId() {
        return boardId;
    }
}
