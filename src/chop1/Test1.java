package chop1;

/**
 * main方法
 */
public class Test1 {
    public static void main(String[] args) {
        test1();
    }
    //测试无参构造方法
    public static void test1(){
        //当创建对象的时候，系统会执行构造方法
        Dog dog=new Dog();
        Penguin penguin=new Penguin();
        penguin.sex=Penguin.MAN;
    }
    //带参构造方法
    public static void test2() {
        Dog dog=new Dog();
        //传递参数
        Dog dog1=new Dog("大黄", dog.health,dog.love, "哈士奇");
    }
    /**
     * 方法重载：
     * 同一个类中
     * 方法名相同
     * 参数列表不同(顺序，类型，数量)
     */
    public static void test(int age,String name){

    }
    public static void test(String name,int age){

    }
}
