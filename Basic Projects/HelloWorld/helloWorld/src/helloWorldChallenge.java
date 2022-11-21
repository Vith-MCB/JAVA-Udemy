/*  CHALLENGE */
//The program should print "Hello (user name)!"

import java.util.*; // Here, the class is imported so it can take a string from the user

public class helloWorldChallenge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //System.in is a standard input stream
        System.out.printf("What is your name? ");
        String name = scn.nextLine(); // Reads the string
        System.out.printf("Hello, "+ name);
    }
}
