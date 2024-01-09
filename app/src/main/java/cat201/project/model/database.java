package cat201.project.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    public static Connection connectDB() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            // Remember to link database first
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/restaurant", "root", ""); 
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
