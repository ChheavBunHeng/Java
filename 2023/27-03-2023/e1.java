import java.sql.*;

public class UpdateDataExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/MySqlJava";
        String username = "root";
        String password = "123";

        String query = "UPDATE mytable SET price = 160000 WHERE cod = 115";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            int rowsAffected = statement.executeUpdate(query);

            System.out.println("Rows affected: " + rowsAffected);

            statement.close();
            connection.close();

        } catch(SQLException e) {
            System.out.println("Error executing SQL query: " + e.getMessage());
        }
    }
}
