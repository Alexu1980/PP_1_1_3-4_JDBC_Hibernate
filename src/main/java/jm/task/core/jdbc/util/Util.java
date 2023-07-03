package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            if (null == conn || conn.isClosed()) {
                conn = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/MyDBtest", "admin", "admin");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
