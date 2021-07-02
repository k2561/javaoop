package chop1;
//企鹅类
//标准构造方法
public class Penguin {
    //static final:静态常量
    //默认公共静态常量:public static final
    static final String MAN="男";
    //调用静态（static）：Penguin.MAN
    //或Penguin penguin=new Penguin();
    //   penguin.sex=penguin.MAN;
    /**
     * 静态常量：
     * 	1.语法：static final 变量类型 变量名 = "值";
     * 	2.特点：不能修改，调用的时候可以是对象名.变量名，也可以是类名.变量名。
     * 	3.static可以修饰属性、方法和代码块
     * 	4.使用static 修饰的属性称为类属性，修饰的方法称为类方法。
     * 	5.不使用static修饰的属性和方法被称为实例属性和实例方法。
     * 	6.final可以修饰属性，方法和类。
     * 	7.不使用static修饰的属性，只能用对象名.属性名来调用。
     */
    static final String WOMEN="女";
    String name="企鹅宝宝";
    int health= 100;
    int love=0;
    String sex="Q仔";
    public void show(){
        System.out.println("姓名是："+name);
        System.out.println("健康值是："+health);
        System.out.println("亲密度是："+love);
        System.out.println("性别是："+sex);
    }
    //无参构造方法
    public Penguin(){

    }
    //带参构造方法
    public Penguin(String name,int health,int love,String sex){
        this.name=name;
        this.health=health;
        this.love=love;
        this.sex=sex;
        show();
    }
}
