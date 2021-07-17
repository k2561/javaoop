package chop10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 * 使用PreparedStatement更新狗狗信息。
 */
public class Test7 {
    private static Logger logger = Logger.getLogger(Test7.class.getName());
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
            String sql="update dog set health=?,love=? where id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 80);
            pstmt.setInt(2, 15);
            pstmt.setInt(3, 1);
            pstmt.executeUpdate();
            pstmt.setInt(1, 90);
            pstmt.setInt(2, 10);
            pstmt.setInt(3, 2);
            pstmt.executeUpdate();
            logger.info("成功更新狗狗信息！");
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

