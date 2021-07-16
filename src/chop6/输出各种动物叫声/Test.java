package chop6.输出各种动物叫声;

import chop6.增加新成员海豚.Animal;
import chop6.增加新成员海豚.Cat;
import chop6.增加新成员海豚.Dolphin;
import chop6.增加新成员海豚.Duck;

/**
 * 测试类，创建各种动物对象，让动物发出叫声。
 */
public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("加菲猫", 4);
        animals[1] = new Duck("唐小鸭", 4);
        animals[2] = new Dolphin("海豚奇奇");
        System.out.println("动物名字\t\t动物叫");
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i].getName() + "\t\t");
            animals[i].shout();
        }
    }
}
