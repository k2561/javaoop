package chop8.异常处理;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * 使用log4j记录日志。
 */
public class Test11 {
    private static Logger logger=Logger.getLogger(Test11.class.getName());
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            logger.debug("输入被除数：" + num1);
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            logger.debug("输入除数：" + num2);
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1/ num2));
            logger.debug("输出运算结果：" + String.format("%d / %d = %d",
                    num1, num2, num1 / num2));
        } catch (InputMismatchException e) {
            logger.error("被除数和除数必须是整数", e);
        } catch (ArithmeticException e) {
            logger.error(e.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            System.out.println("欢迎使用本程序！");
        }
    }
}

