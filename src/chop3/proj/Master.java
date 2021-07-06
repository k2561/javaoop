package chop3.proj;

/**
 *主人
 */
public class Master {
    private String name;
    private double money;
    //喂狗
    public void feed(Dog dog){
        dog.eat();
    }
    //喂猫 方法重载
    public void feed(Cat cat){
        cat.eat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Master(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public Master() {
    }
}
