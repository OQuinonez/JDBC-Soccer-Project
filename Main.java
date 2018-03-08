package com.company;

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
        String TeamChosen = scan.nextLine();
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
//        SPlayerRepositroy.DisplayPlayer();
    }
}
