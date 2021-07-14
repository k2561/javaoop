package chop9.java集合框架;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试
 */
public class TestList {
    public static void main(String[] args) {
        TestMap();
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
    //
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
}
