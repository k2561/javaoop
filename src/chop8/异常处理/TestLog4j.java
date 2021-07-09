package chop8.异常处理;

import org.apache.log4j.Logger;

import java.util.Scanner;
/**
 * 平均分
 */
public class TestLog4j {
    private static Logger logger=Logger.getLogger(TestLog4j.class.getName());
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []nums=new int[3];
        int sum=0;
        for (int i=0;i<nums.length;i++){
            logger.debug("请输入第"+(i+1)+"位学生的成绩");
            System.out.println("请输入第"+(i+1)+"位学生的成绩");
            nums[i]=scanner.nextInt();
            sum+=nums[i];
        }
        System.out.println("总分是:"+sum);
        System.out.println("平均分是:"+sum/nums.length);
    }
}
