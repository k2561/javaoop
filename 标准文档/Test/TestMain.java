import java.util.Scanner;
//测试
public class TestMain {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        test1();
    }
    /*
    * 测试狗狗的方法
    * */
    public static void test1(){
        System.out.println("请输入你需要领养的宠物：1.狗 2.企鹅");
        int pettype=sc.nextInt();
        switch (pettype){
            case 1:
                System.out.println("恭喜你，领养了一只小狗");
                System.out.println("请输入小狗的名字");
                String name=sc.next();
                System.out.println("请输入小狗的品种");
                String p=sc.next();
                Dog dog=new Dog();      //dog类
                dog.name=name;          //名字
                dog.strain=p;           //品种
                dog.show();             //方法
                break;
            case 2:
                System.out.println("恭喜你，领养了一只企鹅");
                System.out.println("请输入企鹅的姓名");
                Penguin penguin=new Penguin();
                penguin.name=sc.next();
                System.out.println("请选择企鹅的性别 1.Q仔 2.Q妹");
                int a=sc.nextInt();
                if(a==1){
                    penguin.sex="Q仔";
                }else {
                    penguin.sex="Q妹";
                }
                penguin.show();
                break;
        }
    }
}
