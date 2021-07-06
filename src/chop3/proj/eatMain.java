package chop3.proj;

/**
 *测试
 */
public class eatMain {
    public static void main(String[] args) {
        //对象
        Master master=new Master("小王",10000);
        Dog dog=new Dog("旺旺",100,100,"哈士奇");
        Cat cat=new Cat("豆豆",100,100,"黄色");
        //方法
        master.feed(dog);
        master.feed(cat);
    }
}
