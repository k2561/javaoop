package chop10.JDBC;

import java.sql.*;

import org.apache.log4j.Logger;
/**
 * 查询所有宠物主人信息。
 */
public class TestJDBC2 {
    private static Logger logger = Logger.getLogger(Test5.class.getName());
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
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
            // 3、查询并输出主人信息
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from master");
            System.out.println("\t主人信息列表");
            System.out.println("编号\t姓名\t元宝数");
            while (rs.next()) {
                System.out.print(rs.getInt("id")+"\t");
                System.out.print(rs.getString("name")+"\t");
                System.out.println(rs.getInt("money"));
            }
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

