package swishbank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;

    public Connn(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swish_bank_db","root","");
            statement = connection.createStatement();
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the database.");
        }
    }
}
