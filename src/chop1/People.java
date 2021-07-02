package chop1;

public class People {
    private String name;
    private String  sex;
    private String phone;
    private int age;
    private double weight;
    public void show(){
        System.out.println("姓名是："+this.name);
        System.out.println("性别是："+this.sex);
        System.out.println("电话是："+this.phone);
        System.out.println("年龄是："+this.age);
        System.out.println("体重是："+this.weight);
    }
    public People() {

    }

    public People(String name, String sex, String phone, int age, double weight) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
