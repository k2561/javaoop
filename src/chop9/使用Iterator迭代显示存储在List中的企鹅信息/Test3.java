package chop9.使用Iterator迭代显示存储在List中的企鹅信息;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 使用ArryList存储和处理企鹅信息。
 */
public class Test3 {
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
        //3、使用Iterator变量ArrayList中的元素
        System.out.println("使用Iterator变量ArrayList中的元素：");
        Iterator iterator = penList.iterator();
        while(iterator.hasNext()){
            Penguin penguin = (Penguin)iterator.next();
            System.out.println(penguin.getName() + " " + penguin.getSex());
        }
        // 4、创建Linked集合对象并把多个企鹅对象放入其中
        LinkedList penLlist = new LinkedList();
        penLlist.add(ououPenguin);
        penLlist.addLast(yayaPenguin);
        penLlist.addFirst(meimeiPenguin);
        penLlist.add(feifeiPenguin); // 添加feifeiPenguin到指定位置
        //5、使用Iterator变量LinkedList中的元素
        System.out.println("使用Iterator变量LinkedList中的元素：");
        iterator = penLlist.iterator();
        while(iterator.hasNext()){
            Penguin penguin = (Penguin)iterator.next();
            System.out.println(penguin.getName() + " " + penguin.getSex());
        }
    }

}

