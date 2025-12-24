package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    private final String serverName = "localhost";
    private final String dbName = "ShopDB"; // Tên database bạn đã tạo trong SQL Server
    private final String portNumber = "1433";
    private final String instance = ""; // Để trống nếu cài mặc định
    private final String userID = "student"; // Tài khoản SQL Server (thường là sa)
    private final String password = "123"; // Mật khẩu SQL Server của bạn

    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance +
                ";databaseName=" + dbName +
                ";encrypt=true;trustServerCertificate=true;"; // Dòng này quan trọng cho SQL Server 2022
        if (instance == null || instance.trim().isEmpty()) {
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber +
                    ";databaseName=" + dbName +
                    ";encrypt=true;trustServerCertificate=true;";
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    // Hàm main để test thử kết nối ngay tại đây
    public static void main(String[] args) {
        System.out.println("hello");
        try {
            System.out.println(new DBContext().getConnection());
            System.out.println("Kết nối thành công!");
        } catch (Exception e) {
            System.out.println("Kết nối thất bại: " + e.getMessage());
        }
    }
}