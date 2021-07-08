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
            //可能出现异常的代码
            System.out.println("请输入被除数");
            //scanner.hasNextInt() 判断
            int num1=scanner.nextInt();
            System.out.println("请输入除数");
            int num2=scanner.nextInt();
            int shang=num1/num2;
            System.out.println(num1+"/"+num2+"="+shang);
        }catch(Exception ex){
            //出现异常之后所执行的代码
            System.out.println("异常错误位置:"+ex.getStackTrace()[0]);
            System.out.println("异常信息:"+ex.getMessage());
            ex.printStackTrace();
            System.out.println("除数不能为零或者不是数字");
        }
        finally {
            //不管出现还是没有出现异常，该代码块都执行
            System.out.println("执行完成");
        }
    }
}
