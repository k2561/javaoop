public class Dog {
    public String name="无名氏";          //姓名
    public int health=100;               //健康值
    public int love=0;                   //亲密度
    String strain="拉布拉多犬";     //品种
    //输出
    public void show(){
        System.out.println("姓名是："+name);
        System.out.println("健康值是："+health);
        System.out.println("亲密度是："+love);
        System.out.println("品种是："+strain);
    }
}
