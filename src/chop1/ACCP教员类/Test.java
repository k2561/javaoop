package chop1.ACCP教员类;

public class Test {
    public static void main(String[] args) {
        ACCPTeacher teacher = null;
        // 1、创建ACCPTeacher对象1并进行自我介绍
        teacher = new ACCPTeacher("李芳", 23, "北京中心");
        teacher.introduce();
        // 2、创建ACCPTeacher对象2并进行自我介绍
        teacher = new ACCPTeacher("张欣", 23, "学士",
                "天津中心", ".NET");
        teacher.introduce();
        teacher = new ACCPTeacher("刘磊", 30, "硕士",
                "上海中心", "BENET");
        teacher.introduce();
    }
}