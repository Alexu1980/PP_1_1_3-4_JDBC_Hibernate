package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection conn = null;
    private static Util instance = null;

    private Util() {
        try {
            if (null == conn || conn.isClosed()) {
                conn = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/MyDBtest", "admin", "admin");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Util getInstance() {
        if (null == instance) {
            instance = new Util();
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }
}
