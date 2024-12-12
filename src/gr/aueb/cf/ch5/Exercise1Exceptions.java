package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Exercise1Exceptions {

static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int index;

        while (true) {


           try {
               printMenu();

               index = inputScanner();
               swicher(index);
           } catch (IllegalArgumentException e) {
               System.out.println(e.getMessage());

           }



        }
    }

    public static void printMenu () {



        System.out.println("1.Μπασκετ");
        System.out.println("2.Ποδοσφαιρο");
        System.out.println("3.Βολει");
        System.out.println("4.Πινκ πονκ");
        System.out.println("5.Εξοδος");
    }

    public static int inputScanner () {

        if (!in.hasNextInt()) {
            in.next();
            throw new IllegalArgumentException ("Η επιλογη πρεπει να ειναι ενας αριθμος");

        }

        int choice = in.nextInt();
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Η επιλογη πρεπει να ειναι απο 1 εως 5");
        }

        return choice;
    }

    public static void swicher (int index) {

       switch (index) {
           case 1:
               System.out.println("Επιλεξατε Μπασκετ");
               break;
           case 2:
               System.out.println("Επιλεξατε Ποδοσφαιρο");
               break;
           case 3:
               System.out.println("Επιλεξατε Βολει");
               break;
           case 4:
               System.out.println("Επιλεξατε πινκ πονκ");
               break;
           case 5:
               System.out.println("Εξοδος");
               System.exit(0);

       }

    }
}
