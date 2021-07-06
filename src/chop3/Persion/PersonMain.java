package chop3.Persion;

/**
 *测试
 */
public class PersonMain {
    public static void talk(Person person){
        person.jianghua();
    }
    public static void main(String[] args) {
        Person chinese=new Chinese("中国","中文");
        chinese.jianghua();
        Chinese chinese1=new Chinese("美国","English");
        chinese1.jianghua();
        Person english=new English("美国","English");
        english.jianghua();
        English english1=new English("英国","中文");
        english1.jianghua();
        //多态实现
        talk(chinese);
        talk(chinese1);
        talk(english);
        talk(english1);
    }
}
