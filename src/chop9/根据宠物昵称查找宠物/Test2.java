package chop9.根据宠物昵称查找宠物;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据宠物的昵称查找宠物。
 */
public class Test2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // 1、创建多个狗狗对象
        Dog ououDog = new Dog("欧欧", "雪娜瑞");
        Dog yayaDog = new Dog("亚亚", "拉布拉多");
        Dog meimeiDog = new Dog("美美", "雪娜瑞");
        Dog feifeiDog = new Dog("菲菲", "拉布拉多");

        // 2、将多个狗狗对象放入Map中，取昵称为键名
        Map dogs = new HashMap();
        dogs.put("欧欧", ououDog);
        dogs.put("亚亚", yayaDog);
        dogs.put("美美", meimeiDog);
        dogs.put("菲菲", feifeiDog);

        // 3、判断Map中是否存在指定key的值对象
        if (dogs.containsKey("欧欧")) {
            // 3.1如果存在，输出值对象信息
            Dog dog = (Dog) dogs.get("欧欧");
            System.out.println("Map中存在指定对象，对象信息如下：");
            System.out.println(dog.getName() + "\t" + dog.getStrain());
        } else {
            // 3.2、如果不存在，输出说明信息
            System.out.println("Map中不存在该对象。");
        }
    }
}

