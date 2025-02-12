package gr.aueb.cf.ch1InitialSteps;

import java.util.Scanner;

public class MenuAppWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputUser = 0;

        do {
            System.out.println("1.Εισαγωγη");
            System.out.println("2.Διαγραφη");
            System.out.println("3.Ενημερωση");
            System.out.println("4.Αναζητηση");
            System.out.println("5.Εξοδος");
            inputUser = in.nextInt();

            if (inputUser == 1) {
                System.out.println("Επιλεξατε εισαγωγη");
            } else if (inputUser == 2) {
                System.out.println("Επιλεξατε Διαγραφη");
            } else if (inputUser == 3) {
                System.out.println("Επιλεξατε Ενημερωση");
            } else if (inputUser == 4) {
                System.out.println("Επιλεξατε Αναζητηση");
            }
        } while (inputUser != 5);

        System.out.println("Thanks for using our App");

    }
}