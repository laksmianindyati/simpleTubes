package com.example.Project2;

import java.sql.*;

public class tryConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/coffeeproject2";
        String username = "root";
        String password = "root";

        System.out.println("Connecting database ...");

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
        System.out.println("Database connected!");
        String sqlquery = "SELECT * FROM coffees";

        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(sqlquery);

        while(rset.next()) {   // Move the cursor to the next row
            System.out.println(rset.getString("id") + ", "
                    + rset.getString("name") );
         }

    } catch (SQLException e) {
        throw new IllegalStateException("Cannot connect the database!", e);
    }
    }
}
