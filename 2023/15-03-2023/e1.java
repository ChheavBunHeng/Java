import java.sql.*;
public class e1
{
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final", "root", "123");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from jobs");
        }
    }
}