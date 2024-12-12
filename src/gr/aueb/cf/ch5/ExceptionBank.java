package gr.aueb.cf.ch5;

import java.util.Scanner;

public class ExceptionBank {

    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("--- Simple Bank Menu -----");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.println("Επιλεξτε το ποσο: ");
                        double amountdepo = in.nextDouble();
                        deposit(amountdepo);
                        System.out.println("Το συνολικο σας ποσο ειναι  " + balance);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Δεν μπορει να γινει αυτη η συναλαγη");
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Επιλεξτε το ποσο: ");
                        double amountdraw = in.nextDouble();
                        withdraw(amountdraw);
                        System.out.println("Το συνολικο σας ποσο ειναι  " + balance);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Δεν μπορει να πραγματοποιηθει αυτη η συναλαγη");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + balance + "$");
                    break;
                case 4:
                    System.out.println("Thank you for using Simple bank. Goodbye");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again");

            }
        }
    }

    public static void withdraw(double amount) {


        try {
            if (amount <= 0) {
                throw new IllegalArgumentException();
            }



            if (amount > balance) {
                throw new IllegalArgumentException();
            }

            balance -= amount;

        } catch (IllegalArgumentException e) {
            System.err.println("Error" + e.getMessage());
            throw e;
        }

    }

    public static void deposit (double deposit) {

         try {

             if (deposit <= 0) {
                 throw new IllegalArgumentException();

             }

             balance += deposit;

         } catch (IllegalArgumentException e) {
             System.err.println("Error" + e.getMessage());
             throw e;
         }


    }
}

