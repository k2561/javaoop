package chop8.阶乘;

import java.util.Scanner;

/**
 *阶乘
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long cNum = 1; // 保存用户计算的正数
        System.out.print("输入数字:");
        try {
            int inputNum = input.nextInt(); // 通过键盘输入
            if (inputNum <= 0 || inputNum > 20) {
                throw new Exception("输入错误");
            }
            for (int i = 1; i <= inputNum; i++) {
                cNum = i * cNum;
            }
            System.out.println(inputNum + " 的阶乘是 " + cNum);
        } catch (java.util.InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
