package chop10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * 使用JDBC的纯Java方式建立数据库连接并关闭。
 */
public class TestJDBC1 {
    private static Logger logger = Logger.getLogger(Test1.class.getName());

    public static void main(String[] args) {
        Connection conn = null;
        // 1、加载驱动
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            logger.error(e);
        }
        // 2、建立连接
        try {
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;DatabaseName=epet",
                    "jbit", "bdqn");
            System.out.println("建立连接成功！");
        } catch (SQLException e) {
            logger.error(e);
            e.printStackTrace();
        } finally {
            // 3、关闭连接
            try {
                if (null != conn) {
                    conn.close();
                    System.out.println("关闭连接成功！");
                }
            } catch (SQLException e) {
                logger.error(e);
            }
        }
    }
}
