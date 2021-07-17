package chop10.新闻标题CRUD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用PreparedStatement插入多条新闻标题。
 */
public class TestInsertRows {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
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
            // 3、插入多条新闻标题信息到数据库
            pstmt = conn.prepareStatement("insert into title (id,titlename,creator,createtime) values (?,?,?,? )");
            pstmt.setInt(1, 1);
            pstmt.setString(2, "政治");
            pstmt.setString(3, "管理员");
            pstmt.setDate(4, new Date(new java.util.Date().getTime()));
            pstmt.executeUpdate();

            pstmt.setInt(1, 2);
            pstmt.setString(2, "军事");
            pstmt.setString(3, "管理员");
            pstmt.setDate(4, new Date(new java.util.Date().getTime()));
            pstmt.executeUpdate();

            System.out.println("插入新闻标题信息成功");
        } catch (SQLException e) {
            e.printStackTrace();
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
                e.printStackTrace();
            }
        }
    }
}

