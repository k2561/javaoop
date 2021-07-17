package chop10.新闻标题CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 更新新闻标题。
 */
public class TestUpdate {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        // 1、加载驱动
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            // 2、建立连接
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;DatabaseName=news",
                    "jbit", "bdqn");
            // 3、更新新闻标题信息到数据库
            stmt = conn.createStatement();
            stmt.executeUpdate("update title set titlename='政治' where id=1");
            System.out.println("更新新闻标题成功");
        } catch (SQLException e) {
            e.printStackTrace();
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
                e.printStackTrace();
            }
        }
    }
}
