package chop8.异常处理;

import java.util.Scanner;

/**
 *
 */
public class TestNum {
    public static void main(String[] args) {
        test1();
    }
    //计算商
    static Scanner scanner=new Scanner(System.in);
    public static void test1(){
        try {
            System.out.println("请输入被除数");
            //scanner.hasNextInt() 判断
            int num1=scanner.nextInt();
            System.out.println("请输入除数");
            int num2=scanner.nextInt();
            int shang=num1/num2;
            System.out.println(num1+"/"+num2+"="+shang);
        }catch(Exception ex){
            System.out.println("除数不能为零或者不是数字");
        }
        finally {
            System.out.println("执行完成");
        }
    }
}
