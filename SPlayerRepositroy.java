package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SPlayerRepositroy {
    public static void DisplayPlayer() {
        try {
            Connection con = Connect.LoadDB();
            PreparedStatement statement = con.prepareStatement("SELECT Players.FName, " +
                    "Players.LName, " + "Teams.TeamName " +
                    "FROM Players JOIN Teams ON Players.TeamID = Teams.TeamID ");
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            System.out.println(resultSet.getString("FName") + " " + resultSet.getString("LName") + " " + resultSet.getString("TeamName"));
//            return new SoccerPlayer(resultSet.getString("FName"), resultSet.getString("LName"), resultSet.getString("team"));
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
//            return null;
        }
    }
}
