package chop3.proj;

/**
 *宠物
 */
public abstract class Pet {
    private String name;
    private int helath;
    private int love;

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHelath() {
        return helath;
    }

    public void setHelath(int helath) {
        this.helath = helath;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public Pet() {
    }

    public Pet(String name, int helath, int love) {
        this.name = name;
        this.helath = helath;
        this.love = love;
    }
}
