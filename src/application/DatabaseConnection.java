package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection connection;

    public static Connection getConnection() {

        final String dbUrl = "jdbc:mysql://localhost:3306/diary";  
        final String dbUsername = "root";
        final String dbPassword = "paniikkiIsR34L-";

        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        }   // try end

        catch (Exception e) {
            e.printStackTrace();
        }  // catch end

        return connection;
    }
}    // class end