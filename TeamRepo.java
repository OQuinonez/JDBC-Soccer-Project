package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamRepo {
    public static void DisplayTeam(){
        try {
            Connection con = Connect.LoadDB();
            PreparedStatement statement = con.prepareStatement("SELECT TeamName, " +
                    "NumOfPlayers FROM Teams");
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            System.out.println(resultSet.getString("TeamName") + " " + resultSet.getInt("numofplayers"));
        } catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
    }
}
