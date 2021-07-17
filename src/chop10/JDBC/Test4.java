package chop10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;

/**
 * 使用Statement的executeUpdate()方法更新狗狗信息。
 */
public class Test4 {
    private static Logger logger = Logger.getLogger(Test4.class.getName());
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
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
            // 3、更新狗狗信息到数据库
            stmt = conn.createStatement();
            stmt.executeUpdate("update dog set health=80,love=15 where id=1");
            logger.info("成功更新狗狗信息！");
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

