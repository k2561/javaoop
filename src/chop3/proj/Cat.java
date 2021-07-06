package chop3.proj;

/**
 *猫
 */
public class Cat extends Pet{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String name, int helath, int love, String color) {
        super(name, helath, love);
        this.color = color;
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+"小猫吃饱了");
    }
}
