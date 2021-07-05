package chop2.che;

/**
 *自行车
 */
public class Bike extends Car{
    //类型：电动，脚蹬
    private String lx="脚蹬";
    public Bike(){

    }
    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        if(lx=="电动"){
            this.lx = "电动";
        }else {
            this.lx=lx;
        }

    }

    public Bike(String lx) {
        this.lx = lx;
    }

    public Bike(String name, String ping, String color, float price, String lx) {
        super(name, ping, color, price);
        this.lx = lx;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("类型："+lx);
    }
}
