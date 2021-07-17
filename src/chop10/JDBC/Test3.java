package chop10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;

/**
 * 使用Statement的execute()方法插入狗狗信息。
 */
public class Test3 {
    private static Logger logger = Logger.getLogger(Test3.class.getName());
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String name = "欧欧"; // 昵称
        int health = 100; // 健康值
        int love = 0; // 亲密度
        String strain = "酷酷的雪娜瑞"; // 品种
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
            // 3、插入狗狗信息到数据库
            stmt = conn.createStatement();
            StringBuffer sbSql = new StringBuffer(
                    "insert into dog (name,health,love,strain) values ( '");
            sbSql.append(name + "',");
            sbSql.append(health + ",");
            sbSql.append(love + ",'");
            sbSql.append(strain + "')");
            stmt.execute(sbSql.toString());
            logger.info("插入狗狗信息成功！");
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
