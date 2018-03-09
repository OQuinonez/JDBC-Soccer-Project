package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SPlayerRepositroy {
    public static void DisplayPlayer(Integer TeamRank) {
        try {
            Connection con = Connect.LoadDB();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM Players WHERE TeamID=" + TeamRank );// +
//                    "Players.LName, " + "Teams.TeamName WHERE TEAMS.TEAMNAME=AGUILAS " +
//                    "FROM Players JOIN Teams ON Players.TeamID = Teams.TeamID ");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("FName") + " " + resultSet.getString("LName") + "\t\t"
                + resultSet.getInt("PlayerID")); //+ resultSet.getString("TeamName"));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void DisplayPLayerStatistics(Integer PlayerID){
        try {
            Connection con = Connect.LoadDB();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM PlayerStatistics WHERE PlayerID=" + PlayerID);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Goals") + "\t\t" + resultSet.getInt("Assist") + "\t\t" +
                        resultSet.getInt("YCards") + "\t\t\t"+ resultSet.getInt("RCards"));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void DisplayPLayerInfo(Integer PlayerID){
        try {
            Connection con = Connect.LoadDB();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM PlayerInfo WHERE PlayerID=" + PlayerID);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Pos") + "\t\t" + resultSet.getInt("Age") + "\t\t" +
                        resultSet.getString("Nationality"));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
