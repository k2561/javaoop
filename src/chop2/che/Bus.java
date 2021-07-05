package chop2.che;

/**
 *公交车
 */
public class Bus extends Car{
    private int zai=8;//载客数

    public int getZai() {
        return zai;
    }

    public void setZai(int zai) {
        if(zai>0&&zai<=24){
            this.zai = 24;
        }else if(zai>24&&zai<=36){
            this.zai = 36;
        }else if(zai>36&&zai<=54){
            this.zai = 54;
        }else {
            this.zai=zai;
        }
    }

    public Bus(){

    }

    public Bus(int zai) {
        this.zai = zai;
    }

    public Bus(String name, String ping, String color, float price, int zai) {
        super(name, ping, color, price);
        this.zai = zai;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("载客数："+zai);
    }
}
