package chop8.异常处理;

import org.apache.log4j.Logger;

import java.util.Scanner;
/**
 * 平均分
 */
public class TestLog4j {
    private final static Logger logger=Logger.getLogger(TestLog4j.class.getName());
    public static void main(String[] args) {
        try {
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
            logger.debug("输出的平均分是:"+sum/nums.length);
            System.out.println("平均分是:"+sum/nums.length);
        }catch (Exception ex){
            logger.error("出现异常啦！");
            logger.error("异常信息是:"+ex.getMessage());
        }finally {
            System.out.println("程序结束");
            logger.debug("程序结束");
        }
    }
}
