package chop8.异常处理;

import java.util.Scanner;

/**
 * 演示程序中的异常。
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int num1 = in.nextInt();
        System.out.print("请输入除数:");
        int num2 = in.nextInt();
        System.out.println(String.format("%d / %d = %d", num1,
                num2, num1/ num2));
        System.out.println("感谢使用本程序！");
    }
}
