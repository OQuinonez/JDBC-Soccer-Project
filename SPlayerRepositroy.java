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
            PreparedStatement statement = con.prepareStatement("SELECT FName" +
                    "LName" +
                    "TeamName WHERE TeamID = TeamID IN Teams");
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            return new SoccerPlayer(resultSet.getString("FName"), resultSet.getString("LName"), resultSet.getString("team"));
        } catch (SQLException exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
