// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package persistence;

import java.sql.*;

public class DbConnection {
    private static Connection connection = null;

    public static Connection get() throws SQLException, ClassNotFoundException {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/java_mysql", "root", "");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassNotFoundException(ex.getMessage());
            }
        }
        return connection;
    }

    public static void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
