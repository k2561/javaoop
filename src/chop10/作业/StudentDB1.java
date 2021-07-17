package chop10.作业;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentDB1 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int rowCount=0;
        // 1、加载驱动
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            // 2、建立连接
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;DatabaseName=epet",
                    "jbit", "bdqn");
            // 3、插入学生信息
            String sqlStr = "insert into student values(?,?)";
            pstmt = conn.prepareStatement(sqlStr);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "张三");
            pstmt.executeUpdate();
            // 4、查询学生人数
            sqlStr = "select count(*) from student ";
            pstmt = conn.prepareStatement(sqlStr);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                rowCount = rs.getInt(1);
            }
            System.out.println("student表中共有"+rowCount+"条记录。");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 4、关闭Statement和数据库连接
            try {
                if (null != rs) {
                    rs.close();
                }
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
