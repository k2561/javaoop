package chop10.作业;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDB2 {
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
            // 3、查询并输出学生信息
            String sqlStr  = "select * from student ";
            pstmt = conn.prepareStatement(sqlStr);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print("id="+rs.getInt(1)+", ");
                System.out.println("name="+rs.getString(2));
            }
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

