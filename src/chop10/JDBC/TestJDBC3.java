package chop10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.log4j.Logger;
/**
 * 使用PreparedStatement插入狗狗信息。
 */
public class TestJDBC3 {
    private static Logger logger = Logger.getLogger(TestJDBC3.class.getName());
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
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
            pstmt = conn.prepareStatement("insert into dog " +
                    "(name,health,love,strain) values(?,?,?,?)");
            pstmt.setString(1, "美美");
            pstmt.setInt(2, 90);
            pstmt.setInt(3, 0);
            pstmt.setString(4, "酷酷的雪娜瑞");
            pstmt.execute();
            logger.info("成功插入狗狗信息");
        } catch (SQLException e) {
            logger.error(e);
        } finally {
            // 4、关闭Statement和数据库连接
            try {
                if (null != pstmt) {
                    pstmt.close();
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

