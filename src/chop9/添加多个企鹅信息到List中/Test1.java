package chop9.添加多个企鹅信息到List中;

import java.util.ArrayList;
import java.util.List;


/**
 * 使用ArryList存储和处理企鹅信息。
 * @author 北大青鸟
 */
public class Test1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // 1、创建多个企鹅对象
        Penguin ououPenguin = new Penguin("欧欧", "Q仔");
        Penguin yayaPenguin = new Penguin("亚亚", "Q妹");
        Penguin meimeiPenguin = new Penguin("美美", "Q妹");
        Penguin feifeiPenguin = new Penguin("菲菲", "Q妹");

        // 2、创建ArrayList集合对象并把多个企鹅对象放入其中
        List penList = new ArrayList();
        penList.add(ououPenguin);
        penList.add(yayaPenguin);
        penList.add(meimeiPenguin);
        penList.add(2, feifeiPenguin); // 添加feifeiPenguin到指定位置

        // 3、输出集合中企鹅的数量
        System.out.println("共计有" + penList.size() + "只企鹅。");

        // 4、通过遍历集合显示各只企鹅信息
        System.out.println("分别是：");
        for (int i = 0; i < penList.size(); i++) {
            Penguin dog = (Penguin) penList.get(i);
            System.out.println(dog.getName() + "\t"
                    + dog.getSex());
        }

        // 5、删除集合中第一个企鹅和feifeiPenguin企鹅
        penList.remove(penList.size()-1);
        penList.remove(feifeiPenguin);

        // 6、显示删除后集合中各只企鹅信息
        System.out.println("\n删除之后还有" + penList.size() + "只企鹅。");
        System.out.println("分别是：");
        for (int i = 0; i < penList.size(); i++) {
            Penguin dog = (Penguin) penList.get(i);
            System.out.println(dog.getName() + "\t" + dog.getSex());
        }
        //7、判断集合中是否包含指定企鹅信息
        if(penList.contains(meimeiPenguin))
            System.out.println("\n集合中包含美美的信息");
        else
            System.out.println("\n集合中不包含美美的信息");
    }

}
