package chop6.输出各种动物腿的条数;

import chop6.增加新成员海豚.Animal;
import chop6.增加新成员海豚.Cat;
import chop6.增加新成员海豚.Dolphin;
import chop6.增加新成员海豚.Duck;
import chop6.增加新成员海豚.Terrestrial;

/**
 * 测试类，创建各种动物对象，输出动物的腿的条数。
 */
public class Test {
    public static void main(String[] args) {
        Animal animals[] = new Animal[3];
        animals[0] = new Cat("加菲猫", 4);
        animals[1] = new Duck("唐小鸭", 2);
        animals[2] = new Dolphin("海豚奇奇");
        System.out.println("动物名字\t\t腿的条数\t\t动物叫");
        for (int i = 0; i < animals.length; i++){
            if (animals[i] instanceof Terrestrial) {
                String name = animals[i].getName();
                int legNum = ((Terrestrial) animals[i]).getLegNum();
                System.out.print(name + "\t\t" + legNum + "\t\t");
                animals[i].shout();
            } else {
                String name = animals[i].getName();
                System.out.print(name + "\t\t" + 0 + "\t\t");
                animals[i].shout();
            }
        }
    }
}

