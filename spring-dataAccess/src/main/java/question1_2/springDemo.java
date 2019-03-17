package question1_2;

/**
 * Create database springDemo with  user table with fields
 *           (a) username
 *           (b) password
 *           (c) name
 *           (d) age
 *           (e) dob
 *  Insert few records inside user Tables.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class springDemo {
    public static void main(String[] args) throws Exception {


        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName).newInstance();
        String connectionString = "jdbc:mysql://localhost:3306/springDemo";
        String username = "root";
        String password = "Vishal@1234";
        Connection connection = (Connection) DriverManager.getConnection(connectionString,
                username, password);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }
}
