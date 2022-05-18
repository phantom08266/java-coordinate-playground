import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface PreparedStatement extends Statement {
    void setInt(int parameterIndex, int x) throws SQLException; // int 값 전달

    void setString(int parameterIndex, String x) throws SQLException; // String 값 전달

    ResultSet executeQuery() throws SQLException; // select 쿼리

    int executeUpdate() throws SQLException;    // insert, update, delete 쿼리
}
