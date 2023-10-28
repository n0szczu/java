package solvd.lab.Homework1;

import java.util.Scanner;

public class task1 {


    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = Name.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}

