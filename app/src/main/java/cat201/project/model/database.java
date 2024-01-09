package cat201.project.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database {
    public static Connection connectDB() {
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");

            // Setup database after establishing connection
            setupDatabase(connect);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connect;
    }

    private static void setupDatabase(Connection connect) {
        try {
            // Open the SQL script file
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/cat201/project/model/setup.sql"));

            // Create a Statement
            Statement stmt = connect.createStatement();

            // Read the SQL script line by line
            String line;
            StringBuilder command = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                // Ignore comments and lines that contain only whitespace
                if (!line.trim().isEmpty() && !line.trim().startsWith("--")) {
                    // Append the line to the current command
                    command.append(line);

                    // If the line ends with a semicolon, it's the end of the command
                    if (line.trim().endsWith(";")) {
                        // Execute the SQL command
                        stmt.executeUpdate(command.toString());

                        // Reset the command
                        command = new StringBuilder();
                    }
                }
            }

            // Close the reader
            reader.close();

        } catch (Exception e) {
            System.out.println("Database setup failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
