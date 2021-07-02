package chop1;
//封装调用
public class Test2 {
    public static void main(String[] args) {
        testStudnt();
    }
    public static void  testStudnt(){
        //有参构造方法
        Student student=new Student(1,"王五",18,"山东济南");
        //无参构造方法
        Student student1=new Student();
        student1.setName("李四");
        System.out.println("姓名是："+student1.getName());
    }
}
