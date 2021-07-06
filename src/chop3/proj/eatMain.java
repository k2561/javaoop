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
        //行参方法
        System.out.println("主人喂宠物的调用");
        //自动类型转换 向上转型
        Pet pet=new Dog("小小",100,100,"哈士奇");
        Pet pet1=new Cat("小白",100,100,"黄色");
        master.feedPet(pet);
        //实参方法
        master.feedPet(dog);
        master.feedPet(cat);
        //强制类型转换 向下转型:将父类对象转换成子类


        Dog dog1= (Dog)pet;
        dog1.play();
        Cat cat1= (Cat)pet1;
        cat1.maoxian();
        /** instanceof运算符的用法：避免类型转换异常
        Pet d1=new Dog();
        Cat c1= (Cat)d1;
        c1.maoxian();
        */
        Pet pp=new Dog();
        if (pp instanceof Dog){
            Dog d1= (Dog)pp;
            d1.play();
        }else if (pp instanceof Cat){
            Cat c1= (Cat)pp;
            c1.maoxian();
        }
    }
}
