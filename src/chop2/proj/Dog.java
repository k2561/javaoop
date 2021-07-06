package chop2.proj;
//狗：继承于宠物
//常量方法
public final class Dog extends Pet{
    /**
     * final的用法
     * final修饰类的时候，该类不能被继承
     * final修饰属性的时候，该属性为常量
     *      只能在声明的时候给它值，不能修改。
     *      常量名均大写
     * final修饰方法的时候，该方法不能被重写
     * final Dog dog=new Dog("欧欧")
     * dog.name="毛毛"      //可以
     * dog=new Dog("默默")  //不可以
     * 使用final修饰引用型变量，变量的值是固定不变的，而变量所指向的对象的属性值是可变的
     */
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
