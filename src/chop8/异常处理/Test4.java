package chop8.异常处理;

import java.util.Scanner;

/**
 * 使用try-catch-finally进行异常处理。
 */
public class Test4 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1/ num2));
        } catch (Exception e) {
            System.err.println("出现错误：被除数和除数必须是整数，" +
                    "除数不能为零。");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("感谢使用本程序！");
        }
    }
}

