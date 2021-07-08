package chop8.异常处理;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 多重catch块。
 */
public class Test6 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1/ num2));
        } catch (InputMismatchException e) {
            System.err.println("被除数和除数必须是整数。");
        } catch (ArithmeticException e) {
            System.err.println("除数不能为零。");
        } catch (Exception e) {
            System.err.println("其他未知异常。");
        } finally {
            System.out.println("感谢使用本程序！");
        }
    }
}

