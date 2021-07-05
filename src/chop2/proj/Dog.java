package chop2.proj;
//狗：继承于宠物
public class Dog extends Pet{
    String strain;

    public String getStrain() {
        return strain;
    }

    //实现父类的抽象方法
    @Override
    public void print() {
        System.out.println("已重写");
    }

    @Override
    public void show() {
        super.show();    //父类方法
        System.out.println("品种是："+this.strain);
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public  Dog(){

    }

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);  //super 父类
        this.strain = strain;
    }

    public Dog(String strain) {
        this.strain = strain;
    }
}
