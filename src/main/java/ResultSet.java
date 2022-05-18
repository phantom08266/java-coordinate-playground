import java.sql.SQLException;

public interface ResultSet {
    int getInt(int columnIndex) throws SQLException;

    String getString(String columnLabel) throws SQLException;

    boolean isFirst() throws SQLException;

    boolean isLast() throws SQLException;
}
