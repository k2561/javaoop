package chop2.proj;

/**
 * 企鹅类
 */
public class Penguin extends Pet{
    String sex;

    public String getSex() {
        return sex;
    }

    @Override
    public void show() {
        super.show();
        super.pass="21";
        System.out.println("性别是："+this.sex);
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Penguin(){

    }

    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public Penguin(String sex) {
        this.sex = sex;
    }
}
