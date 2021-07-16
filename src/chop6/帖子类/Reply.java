package chop6.帖子类;

/**
 * 回复类。
 */
public class Reply extends Tip {
    private int replyId  =  1;  // 回复id
    private int topicId  =  1;  // 主题id，用来表示该回复是哪个主题的
    /**
     * 有参构造方法。
     * @param title 回复标题
     * @param content 回复内容
     * @param publishTime 发表时间
     * @param uid 用户id
     * @param replyId 回复id
     * @param topicId 主题id
     */
    public Reply(String title, String content, String publishTime, int uid,int replyId,int topicId) {
        super(title, content, publishTime, uid);
        this.replyId=replyId;
        this.topicId =topicId;
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.sg.Tip#getInfo()
     */
    public void getInfo(){
        System.out.println("====回复信息====");
        System.out.println("回复标题：" + this.getTitle());
        System.out.println("回复内容：" + this.getContent());
        System.out.println("发表时间：" + this.getPublishTime()+"\n");
    }
    /**
     * 获取回复id。
     * @return 回复id
     */
    public int getReplyId() {
        return replyId;
    }
    /**
     * 主题id。
     * @return 主题id
     */
    public int getTopicId() {
        return topicId;
    }
}

