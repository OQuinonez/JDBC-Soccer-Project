package com.company;

import java.lang.management.PlatformLoggingMXBean;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void Intro(){
        System.out.println("Hello, Here is the Liga Mexicana Table\n");
        System.out.println("Team Name" + "\t" + "Ranking");
        TeamRepo.DisplayTeam();
    }
    public static void ChooseTeam(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Which team would you like to look at?");
        System.out.println("(Choose the Ranking Number)");
        Integer TeamChosen = scan.nextInt();
        System.out.println("First Name,\tLast Name\t Search ID");
        SPlayerRepositroy.DisplayPlayer(TeamChosen);
    }
    public static void ChoosePlayer(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nWould you like to see a Player's " +
                "\n[S]tatistics, or [I]nformation");
        String SorI = scan.nextLine();
        System.out.println("Choose a player you would like know more about" +
                "\n Please Enter the Search ID");
        Integer player = scan.nextInt();
        if (SorI.equals("S")) {
            System.out.println("Goals Assist Yellow Cards Red Cards");
            SPlayerRepositroy.DisplayPLayerStatistics(player);
        }else if (SorI.equals("I")){
            System.out.println("Position  Age  Nationality");
            SPlayerRepositroy.DisplayPLayerInfo(player);
        }
    }


    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
	// write your code here
//        System.out.println("Hello World");
//        Connect.LoadDB();
//        try {
//            Connect con = new Connect();con.LoadDB();
//        }
        Intro();
        ChooseTeam();
        ChoosePlayer();
    }
}
