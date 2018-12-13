package member;

import java.sql.*;

public class DBConnection {
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private Connection conn = null;
    private String JDBC_URL = null;
    private String user = null;
    private String passwd = null;

    public DBConnection() {
    }

    public void init(String dbName, String user, String passwd) {
        JDBC_URL = "jdbc:mysql://localhost:3307/" + dbName;
        this.user = user;
        this.passwd = passwd;
    }

    public Connection getConn() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(JDBC_URL, user, passwd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static void release(Connection connection, PreparedStatement pstmt, ResultSet rs, Statement stmt) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
            }
        }
        if (rs != null) try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
