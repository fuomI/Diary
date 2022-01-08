package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection connection;

    public static Connection getConnection() {

        final String dbUrl = "";  
        final String dbUsername = "";
        final String dbPassword = "";

        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        }   // try end

        catch (Exception e) {
            e.printStackTrace();
        }  // catch end

        return connection;
    }
}    // class end