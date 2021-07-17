package chop10.新闻标题CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 插入新闻标题。
 */
public class TestInsert {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String id = "1";
        String titlename = "军事";
        String creator = "管理员";
        String createtime = "2010-02-02";
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
            // 3、插入新闻标题信息到数据库
            stmt = conn.createStatement();
            StringBuffer sbSql = new StringBuffer(
                    "insert into title (id,titlename,creator,createtime) values ( ");
            sbSql.append(id + ",'");
            sbSql.append(titlename + "','");
            sbSql.append(creator + "','");
            sbSql.append(createtime + "')");
            stmt.execute(sbSql.toString());
            System.out.println("插入新闻标题信息成功");
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

