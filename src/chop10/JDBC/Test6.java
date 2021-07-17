package chop10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import org.apache.log4j.Logger;
/**
 * 使用Statement安全性差，存在SQL注入隐患。
 */
public class Test6 {
    private static Logger logger = Logger.getLogger(Test6.class.getName());
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        //0、根据控制台提示输入用户账号和密码
        Scanner input = new Scanner(System.in);
        System.out.println("\t宠物主人登录");
        System.out.print("请输入姓名：");
        String name=input.next();
        System.out.print("请输入密码：");
        String password=input.next();
        // 1、加载驱动
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            logger.error(e);
        }
        try {
            // 2、建立连接
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;DatabaseName=epet",
                    "jbit", "bdqn");
            // 3、判断宠物主人登录是否成功
            stmt = conn.createStatement();
            String sql="select * from master where name='"+name+
                    "' and password='"+password+"'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            if(rs.next())
                System.out.println("登录成功，欢迎您！");
            else
                System.out.println("登录失败，请重新输入！");
        } catch (SQLException e) {
            logger.error(e);
        } finally {
            // 4、关闭Statement和数据库连接
            try {
                if (null != stmt) {
                    stmt.close();
                }
                if (null != conn) {
                    conn.close();
                }
            } catch (SQLException e) {
                logger.error(e);
            }
        }
    }
}

