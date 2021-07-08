package chop8.异常处理;

import java.sql.SQLClientInfoException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class TestNum {
    public static void main(String[] args) {
        test3();
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
    //异常类型

    /**
     * 常用的异常类型：
     * 1.Exception：所有异常的父类
     * 	2.ArithmeticException:当除数是0的时候出现的异常
     * 	3.ArryOutIndexOfBoundsException:数组下标越界的异常
     * 	4.NullPointerException:空指针异常。
     * 	5.ClassNotFoundException:找不到类的异常。
     * 	6.InputMismatchexception：欲得到数据类型与实际的数据类型不匹配，比如说用int类型接收了一个字符串类型的值。
     * 	Exception 	异常层次结构的根类
     * ArithmeticException	算术错误情形，如以零作除数
     * ArrayIndexOutOfBoundsException	数组下标越界
     * NullPointerException	尝试访问 null 对象成员
     * ClassNotFoundException	不能加载所需的类
     * InputMismatchException	欲得到数据类型与实际输入类型不匹配
     * IllegalArgumentException	方法接收到非法参数
     * ClassCastException	对象强制类型转换出错
     * NumberFormatException	数字格式转换异常，如把"abc"转换成数字
     */
    public static void test2(){
        try {
            int[]nums=new int[3];
            nums[3]=0;
            System.out.println(nums[3]);
        }catch (ArrayIndexOutOfBoundsException ae){
            //错误:err标红处理
            System.err.println("数组越界");
            System.exit(1); // finally语句块不执行的唯一情况
        }finally {
            System.out.println("执行完成");
        }
    }
    //多重catch块
    public static void test3(){
        try {
            int num1=10;
            int num2=0;
            int shang=num1/num2;
            System.out.println("商是："+shang);
        }catch (ArrayIndexOutOfBoundsException ab){
            System.out.println("数组越界");
        }catch (ArithmeticException ae){
            System.out.println("除数不能为零");
        }catch (InputMismatchException ie){
            System.out.println("输入的不是数字");
        }catch (Exception ex){
            //捕获所有异常放在最下面
            System.out.println("出现错误了");
        }finally {
            System.out.println("程序结束");
        }

    }
}
