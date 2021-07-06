package chop2.che;

/**
 *车
 */
public abstract class Car {
    private String name;//姓名
    private String ping;//品牌   type
    private String color;//颜色
    private float price ;//价格

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPing() {
        return ping;
    }

    public void setPing(String ping) {
        this.ping = ping;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**回车
     * 有参构造函数
     * @param name
     * @param ping
     * @param color
     * @param price
     */
    public Car(String name, String ping, String color, float price) {
        this.name = name;
        this.ping = ping;
        this.color = color;
        this.price = price;
    }
    public void show(){
        System.out.println("名字是："+this.name);
    }
    //抽象方法
    public abstract void shows();
}
