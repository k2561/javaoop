package chop9.java集合框架;

import java.util.*;

/**
 * 测试
 * Vector和ArrayList的异同
 * 实现原理相同，功能相同，很多情况下可以互用
 * 两者的主要区别如下
 * Vector线程安全，ArrayList重速度轻安全，线程非安全
 * 长度需增长时，Vector默认增长一倍，ArrayList增长50%
 *
 * Hashtable和HashMap的异同
 * 实现原理相同，功能相同，在很多情况下可以互用
 * 两者的主要区别如下
 * Hashtable继承Dictionary类，HashMap实现Map接口
 * Hashtable线程安全，HashMap线程非安全
 * Hashtable不允许null值，HashMap允许null值
 *
 * 开发过程中，最好使用ArrayList和HashMap
 */
public class TestList {
    public static void main(String[] args) {
        iter();
    }
    public static void testAddp(){
        Person person=new Person("王五",12,"男");
        Person person1=new Person("张三",17,"女");
        List list=new ArrayList();
        list.add(person);
        list.add(person1);
        for (Object o:list) {
            Person p=(Person)o;
            System.out.println(p.getName());
        }
    }
    //泛型集合
    public static void FanList(){
        List<String> strings=new ArrayList<String>();
        strings.add("小芳");
        strings.add("小明");
        strings.add("小王");
        for (String str:strings){
            System.out.println(str);
        }
    }
    //遍历类
    public static void FanList1(){
        List<String> strings=new ArrayList<String>();
        Person person=new Person("王五",12,"男");
        Person person1=new Person("张三",17,"女");
        strings.add(person.getName());
        strings.add(person1.getName());
        for (String str:strings){
            System.out.println(str);
        }
    }
    //Map接口,键值映射关系
    static void TestMap(){
        Map map=new HashMap();
        map.put("cn","中国");
        map.put("en","英国");
        map.put("us","美国");
        map.put("e","俄罗斯");
        //根据键来获取值
        System.out.println("根据键来获取值"+map.get("e"));
        //集合的长度
        System.out.println("集合的长度"+map.size());
        //移除美国
        map.remove("us");
        //获取所有的值
        for (Object o:map.values()){
            System.out.println(o);
        }
        //获取所有的键
        for (Object o:map.keySet()){
            System.out.println(o);
        }
        //判断是否包含en这个键
        if(map.containsKey("en")){
            System.out.println("包含");
        }
        //判断是否包含中国这个值
        if(map.containsValue("中国")){
            System.out.println("包含");
        }
    }
    //泛型Map集合
    static void FanMap(){
        Map<Integer ,String> map=new HashMap<Integer,String>();
        map.put(1,"壹");
        map.put(2,"贰");
        map.put(3,"叁");
        map.put(4,"肆");
        //根据键获取值
        for (Integer integer:map.keySet()){
            System.out.println(map.get(integer));
        }
        //直接遍历值
        System.out.println("遍历所有值");
        for (String s:map.values()){
            System.out.println(s);
        }
    }
    //迭代器
    static void iter(){
        //Integer相当于int
        List<Integer>list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("遍历输出");
        for (Integer i:list){
            System.out.println(i);
        }
        System.out.println("使用迭代器遍历输出");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
