package chop10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConn {

    public static void main(String[] args) {
        Connection conn = null;
        // 1、加载驱动
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 2、建立连接
        try {
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;DatabaseName=news",
                    "jbit", "bdqn");
            System.out.println("建立连接成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 3、关闭连接
            try {
                if (null != conn) {
                    conn.close();
                    System.out.println("关闭连接成功！");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}