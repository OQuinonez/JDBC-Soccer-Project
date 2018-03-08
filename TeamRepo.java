package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamRepo {
    public static void DisplayTeam(){
        try {
            Connection con = Connect.LoadDB();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM Teams");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                System.out.println(resultSet.getString("TeamName") + "\t\t\t" + resultSet.getInt("Ranking"));
            }
        } catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
    }
}
