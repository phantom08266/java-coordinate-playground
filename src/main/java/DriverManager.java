import java.sql.Connection;
import java.sql.SQLException;

public class DriverManager {
    public static Connection getConnection() throws SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection( " jdbc:mysql:localhost:9999/testdb", "username", "test123!");
    }
}
