package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SPlayerRepositroy {
    public static SoccerPlayer MakePlayer(String TeamName){
        try {
            Connection con = Connect.LoadDB();
            // SQL SELCECT STATEMENT BELOW!!!!!
            PreparedStatement statement = con.prepareStatement("SELECT FName, LName FROM Players");
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            return new SoccerPlayer(resultSet.getString("Bob"), resultSet.getString("Larry"));
        } catch (SQLException exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
