package chop9.java集合框架;

import java.util.ArrayList;
import java.util.List;


/**
 * 测试ArryList的add()、size()、get()方法。
 */
public class Test1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        testArrayList();
    }
    public static void testArrayList(){
        //创建ArrayList集合对象
        List numlist=new ArrayList();
        /**List接口特点
         * List接口：存储的是一组不唯一，有序的对象
         * a.ArrayList实现类：实现了长度可变的数组，遍历数据的时候效率比较高
         * b.LinkedList实现类：采用链表存储方式，插入和删除元素的时候效率比较高
         */
        //添加数据
        numlist.add(1);
        numlist.add(2);
        numlist.add(1);
        numlist.add("张三");
        numlist.add(true);
        //遍历list集合
        for (Object i:numlist) {
            System.out.println(i);
        }
    }
    public static void test(){
        // 1、创建多个狗狗对象
        Dog ououDog = new Dog("欧欧", "雪娜瑞");
        Dog yayaDog = new Dog("亚亚", "拉布拉多");
        Dog meimeiDog = new Dog("美美", "雪娜瑞");
        Dog feifeiDog = new Dog("菲菲", "拉布拉多");

        // 2、创建ArrayList集合对象并把多个狗狗对象放入其中
        List dogs = new ArrayList();
        dogs.add(ououDog);
        dogs.add(yayaDog);
        dogs.add(meimeiDog);
        dogs.add(2, feifeiDog); // 添加feifeiDog到指定位置

        // 3、输出集合中狗狗的数量
        System.out.println("共计有" + dogs.size() + "条狗狗。");

        // 4、通过遍历集合显示各条狗狗信息
        System.out.println("分别是：");
        for (int i = 0; i < dogs.size(); i++) {
            Dog dog = (Dog) dogs.get(i);
            System.out.println(dog.getName() + "\t"
                    + dog.getStrain());
        }
    }
}
