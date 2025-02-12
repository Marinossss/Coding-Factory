package gr.aueb.cf.ch2InitialSteps;


import java.util.Scanner;

public class MenuStars {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            starsMenu();
            choice = inputUser();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice must be between 1-6. Try again)");
                continue;
            }

            switcher(choice);


        } while (choice != 6);
    }

    public static int inputUser() {
        return in.nextInt();
    }

    public static void starsMenu() {

        System.out.println("1.Display stars horizontally.");
        System.out.println("2.Display stars vertically.");
        System.out.println("3.Display n lines with n stars.");
        System.out.println("4.Display n lines with stars from 1 to n.");
        System.out.println("5.Display n lines with stars from n to 1.");
        System.out.println("6.Exit the program");
    }

    public static void switcher(int choice) {
        int n;

        switch (choice) {
            case 1:
                System.out.print("How many stars do you want horizontally: ");
                n = inputUser();
                printStarsInRow(n);
                break;
            case 2:
                System.out.print("How many stars do you want vertically: ");
                n = inputUser();
                printStarsInColum(n);
                break;
            case 3:
                System.out.print("How many stars do you want for the n X n grid: ");
                n = inputUser();
                nxnStars(n);
                break;
            case 4:
                System.out.print("How many stars do you want for the pyramid from 1 to n: ");
                n = inputUser();
                starsIncreasing(n);
                break;
            case 5:
                System.out.print("How many stard do you want for the pyramid from n to 1: ");
               n = inputUser();
                starsDecreasing(n);
                break;
            case 6:
                System.out.print("Thank you for using our application.");
                break;
            default:
                System.out.println("Error in choice");

        }

    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static void printStarsInRow(int n) {
//        n = inputUser();
        for (int i = 1; i <= n; i++) {

            System.out.print("*");
        }

        System.out.println();
    }

    public static void starsIncreasing(int n) {
//        n = inputUser();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void nxnStars(int n) {
//        n = inputUser();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void starsDecreasing(int n) {
//        n = inputUser();
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStarsInColum(int n) {
//        n = inputUser();
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

}