package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StringExercise1 {


    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.print("Enter a string to encrypt: ");

        String inputNext = in.nextLine(); // Δέχεται τη συμβολοσειρά από τον χρήστη
        String nextOne = encryptString(inputNext); // Καλεί τη μέθοδο κρυπτογράφησης

//        System.out.print("Enter a string to encrypt: ");
//        String inputPrevious = in.nextLine();
        String previousOne = encryptStringPrevious(inputNext);


        System.out.println("Encrypted string: " + nextOne); // Εμφανίζει την κρυπτογραφημένη συμβολοσειρά
        System.out.println("Encrypted string: " + previousOne);
    }

   public static String encryptString(String c) {

       StringBuilder encrypted = new StringBuilder();

       for (int i = 0; i < c.length(); i++) {
           char ch = c.charAt(i);
           char nextChar = (char) (ch + 1);
           encrypted.append(nextChar);
       }

       return encrypted.toString();


   }

    public static String encryptStringPrevious(String c) {

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);
            char nextChar = (char) (ch - 1);
            encrypted.append(nextChar);
        }

        return encrypted.toString();


    }

}
