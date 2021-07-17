package chop10.新闻标题CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

/**
 * 查询新闻标题信息。
 */
public class TestQuery {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
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
            // 3、查询并输出新闻标题信息
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from title");
            System.out.println("\t\t新闻标题列表");
            System.out.println("编号\t标题\t创建者\t创建时间");
            while (rs.next()) {
                System.out.print(rs.getInt(1)+"\t");
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getString(3)+"\t");
                System.out.println(rs.getDate(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 4、关闭Statement和数据库连接
            try {
                if (null != rs) {
                    rs.close();
                }
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

