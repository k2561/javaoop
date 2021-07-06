package chop3.Persion;

/**
 *中国
 */
public class Chinese extends Person{
    public Chinese(String name, String lan) {
        super(name, lan);
    }

    public Chinese() {
    }

    @Override
    public void jianghua() {
        this.setName("中国");
        this.setLan("中文");
        System.out.println(this.getName()+"讲"+getLan());
    }
}
