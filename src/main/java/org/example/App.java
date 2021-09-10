/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Program prompts user for a username and password.
    // Then asks for a password, if the password matches print "Welcome!". If it does not match print "I don't know you."
    public static void main( String[] args )
    {
        String user, pass, passAttempt;

        System.out.println("Set a username: ");
        Scanner inputUser = new Scanner(System.in);
        user = inputUser.nextLine();

        System.out.println("Set a password: ");
        Scanner inputPass = new Scanner(System.in);
        pass = inputPass.nextLine();

        System.out.println("Your username is " + user);
        System.out.println("What is the password? ");
        Scanner inputPassAttempt = new Scanner(System.in);
        passAttempt = inputPassAttempt.nextLine();

        if (passAttempt.equals(pass))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I dont know you.");
        }
    }
}
