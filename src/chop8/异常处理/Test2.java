package chop8.异常处理;

import java.util.Scanner;
/**
 * 尝试通过if-else来解决异常问题。
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int num1 = 0;
        if (in.hasNextInt()) { // 如果输入的被除数是整数
            num1 = in.nextInt();
        } else { // 如果输入的被除数不是整数
            System.err.println("输入的被除数不是整数，程序退出。");
            System.exit(1); // 结束程序执行
        }
        System.out.print("请输入除数:");
        int num2 = 0;
        if (in.hasNextInt()) { // 如果输入的除数是整数
            num2 = in.nextInt();
            if (0 == num2) { // 如果输入的除数是0
                System.err.println("输入的除数是0，程序退出。");
                System.exit(1);
            }
        } else { // 如果输入的除数不是整数
            System.err.println("输入的除数不是整数，程序退出。");
            System.exit(1);
        }
        System.out.println(String.format("%d / %d = %d",
                num1, num2, num1/ num2));
        System.out.println("感谢使用本程序！");
    }

}
