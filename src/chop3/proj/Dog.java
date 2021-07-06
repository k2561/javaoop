package chop3.proj;

/**
 * 狗
 */
public class Dog extends Pet{
    private String strain;

    public String getStrain() {
        return strain;
    }
    //接飞盘
    public void play(){
        System.out.println("和"+this.getName()+"玩接飞盘,亲密度加10");
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
    //实现抽象方法
    @Override
    public void eat() {
        System.out.println(super.getName()+"小狗吃饱了");
    }

    public Dog(){

    }
    public Dog(String strain) {
        this.strain = strain;
    }

    public Dog(String name, int helath, int love, String strain) {
        super(name, helath, love);
        this.strain = strain;
    }
}
