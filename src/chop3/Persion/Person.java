package chop3.Persion;

/**
 * 语言
 */
public abstract class Person {
    private String name;
    private String lan;

    public Person(String name, String lan) {
        this.name = name;
        this.lan = lan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public Person() {

    }

    public abstract void jianghua();
}
