package chop8.异常处理;

import java.util.InputMismatchException;

/**
 * 处理异常
 */
public class SuanShu {
    //同一个软件包中必须处理全部错误
    public static void main(String[] args) {
        //不能继续抛出异常只能处理异常
        try {
            //非静态方法不能调用静态方法
            jisuan();
        }catch (Exception ex){
            System.err.println("出现错误");
        }finally {
            System.out.println("执行完毕");
        }

    }
    //
    public void jisuan1() throws Exception {
        //调用计算的方法
        // 继续抛出或处理异常
        jisuan();
    }
    //抛出异常=声明异常
    public static void jisuan() throws InputMismatchException,Exception{
        int num1=10;
        int num2=0;
        int shang=num1/num2;
        System.out.println("商是:"+shang);
    }
}
