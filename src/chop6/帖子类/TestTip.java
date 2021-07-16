package chop6.帖子类;

/**
 * 测试类。
 */
public class TestTip {
    public static void main(String[] args) {
        // 创建主题对象并输出信息
        Tip tip = new Topic("我会用继承了","如题","2010-10-1 12:01:10",1,2,3);
        tip.getInfo();
        // 创建回复对象并输出信息
        tip = new Reply("Re:我会用继承了","我早就会了","2010-10-1 12:03:12",2,4,2);
        tip.getInfo();
    }
}

