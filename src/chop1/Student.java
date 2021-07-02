package chop1;
//学生类
public class Student {
    private int sid;
    private String name;
    private int age;
    private String address;
    //对学生类属性进行封装
    //快捷键:insert + Ait（Getter） 或getsid
    public int getSid() {
        return sid;
    }
    //快捷键:insert + Ait（setter） 或setsid
    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //年龄默认60且大于60小于100
    public void setAge(int age) {
        if(age<60||age>100){
            this.age=60;
        }else {
            this.age = age;
        }

    }
    //快捷键:insert + Ait（构造函数）
    //无选择
    public Student(){

    }
    //ctrl+鼠标点击选择
    public Student(int sid,String name,int age,String address){
        this.sid=sid;
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
