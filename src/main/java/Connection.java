import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Connection {
    PreparedStatement prepareStatement(String sql) throws SQLException;
}
