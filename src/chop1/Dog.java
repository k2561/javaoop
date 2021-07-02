package chop1;

public class Dog {
    String name="无名氏";          //姓名
    int health=100;               //健康值
    int love=0;                   //亲密度
    String strain="拉布拉多犬";     //品种
    //无参构造方法:方法名与类名相同，无返回值
    //先执行无参构造方法，再执行类的方法
    //系统会自动的创建一个无参的构造方法。但是，如果该类里面有带参的构造方法的话，系统将不会自动创建无参的构造方法，必须得手动创建一个无参的构造方法。
    public Dog(){
        System.out.println("执行无参的构造方法");
    }
    //如果该类里面有带参的构造方法的话，系统将不会自动创建无参的构造方法,必须得手动创建一个无参的构造方法
    //带参构造方法:方法名与类名相同，无返回值，有参数
    //执行带参构造方法：先传值，再执行
    public Dog(String name,int health ,int love,String strain){
        System.out.println("执行带参构造方法");
        //当前的name等于传递参数的name
        this.name=name;
        this.health=health;
        this.love=love;
        this.strain=strain;
        show();
    }
    public Dog(String name,int health){

    }
    //输出
    public void show(){
        System.out.println("姓名是："+name);
        System.out.println("健康值是："+health);
        System.out.println("亲密度是："+love);
        System.out.println("品种是："+strain);
    }
}
