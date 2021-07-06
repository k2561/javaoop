package chop3.Persion;

/**
 *美国
 */
public class English extends Person{
    public English(String name, String lan) {
        super(name, lan);
    }

    public English() {
    }

    @Override
    public void jianghua() {
        this.setLan("English");
        System.out.println(this.getName()+"讲"+getLan());
    }
}
