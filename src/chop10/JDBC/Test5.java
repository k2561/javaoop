package chop10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;
/**
 * 使用Statement的executeQuery()方法查询并输出狗狗信息。
 */
public class Test5 {
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
            // 3、查询并输出狗狗信息
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from dog");
            System.out.println("\t\t狗狗信息列表");
            System.out.println("编号\t姓名\t健康值\t亲密度\t品种");
            while (rs.next()) {
                System.out.print(rs.getInt(1)+"\t");
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getInt("health")+ "\t");
                System.out.print(rs.getInt("love")+"\t");
                System.out.println(rs.getString("strain"));
            }
        } catch (SQLException e) {
            logger.error(e);
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
                logger.error(e);
            }
        }
    }
}
