package chop10.JDBC;

/**
 *
 */
import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        //声明Connection对象
        Connection conn = null;
        //驱动程序名
        try {
            String driver = "com.mysql.jdbc.Driver";
            //URL指向要访问的数据库名java  java:库名
            String url = "jdbc:mysql://localhost:3306/java?useSSL=false&serverTimezone=UTC";
            //MySQL配置时的用户名
            String user = "root";
            //MySQL配置时的密码
            String password = "root";
            System.out.println("建立连接成功！");
            String sql="select * from user";
        }finally {
            System.out.println("执行维B");
        }
    }
}
