package chop9.java集合框架;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * 测试ArryList的add()、size()、get()方法。
 */
public class Test1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        testLinkedList();
    }
    //List接口：存储的是一组不唯一，有序的对象

    //创建ArrayList集合对象
    public static void testArrayList(){
        List numlist=new ArrayList();
        //ArrayList实现类：实现了长度可变的数组，遍历数据的时候效率比较高
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
    //LinkedList实现类：采用链表存储方式，插入和删除元素的时候效率比较高
    public static void testLinkedList(){
        List link=new LinkedList();
        //add(Object o):将元素添加到集合中
        link.add(1);
        link.add("王五");
        link.add(false);
        //add(int i,Object o):将元素添加到集合的指定位置中
        //给第一个位置添加数据
        link.add(0,"2");
        //给最后一个位置添加数据
        link.add(link.size()-1,"张三");
        for (Object i:link) {
            System.out.println(i);
        }
        //contains:在集合中查找指定的元素
        if(link.contains("王五")){
            System.out.println("包含这个人");
        }else {
            System.out.println("不包含");
        }
        //size():统计集合中元素的个数
        System.out.println("集合的长度是："+link.size());
        //get(int i):根据下标来获取集合中的元素
        System.out.println("集合的第二个元素："+link.get(2));
        //remove:可以根据下标来删除元素，也可以直接根据元素来删除

        //index下标从零开始
        link.remove(3);
        //o:object对象 类型随意
        link.remove("王五");
        System.out.println("删除之后的集合");
        for (Object i:link) {
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
