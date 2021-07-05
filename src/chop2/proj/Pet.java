package chop2.proj;
//宠物
public class Pet {
    private String name;
    private int health;
    private int love;
    String pass;

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
