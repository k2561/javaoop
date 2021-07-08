package chop8.异常处理;

/**
 * 学生
 */
public class Student {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age==18){
            this.age = age;
        }else {
            throw  new Exception("年龄必须是18岁");
        }
    }

    public String getSex() {
        return sex;
    }
    //抛出异常
    public void setSex(String sex) throws Exception {
        if(sex.equals("男")||sex.equals("女")){
            this.sex = sex;
        }else {
            throw new Exception("性别必须是男或女");
        }
    }
    public void show(){
        System.out.println("大家好");
        System.out.println("我叫"+name);
        System.out.println(",今年"+age);
        System.out.println("岁,性别是"+sex);
    }
}
