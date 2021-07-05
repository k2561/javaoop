package chop2.proj;
//宠物
//父类抽象(abstract)：防止父类的无意义调用
public abstract class  Pet {
    private String name;
    private int health;
    private int love;
    String pass;
    //方法重写(抽象方法：子类必须调用)
    public abstract void print();

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public void show(){
        System.out.println("名字是："+this.name);
        System.out.println("健康值是："+this.health);
        System.out.println("亲密度是："+this.love);
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}
