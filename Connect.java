package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static Connection LoadDB() throws SQLException{
        return DriverManager.getConnection("jdbc:postgresql:Soccer-Statistics", "basecamp", "localpass");
    }
}
