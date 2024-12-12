package gr.aueb.cf.ch2;


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

        System.out.println("1.Εμφανισε n αστερακια οριζοντια");
        System.out.println("2.Εμφανισε n αστερακια καθετα");
        System.out.println("3.Εμφανισε n γραμμες με n αστερακι");
        System.out.println("4.Εμφανισε n γραμμες με αστερακια 1 εως n");
        System.out.println("5.Εμφανισε n γραμμες με αστερακια n εως 1");
        System.out.println("6.Εξοδος απο το προγραμμα");
    }

    public static void switcher(int choice) {
        int n;

        switch (choice) {
            case 1:
                System.out.print("Πόσα αστερια θέλεις οριζόντια; ");
                n = inputUser();
                printStarsInRow(n);
                break;
            case 2:
                System.out.print("Πόσα αστερια θέλεις κάθετα; ");
                n = inputUser();
                printStarsInColum(n);
                break;
            case 3:
                System.out.print("Πόσα αστερια θέλεις για το πίνακα n x n; ");
                n = inputUser();
                nxnStars(n);
                break;
            case 4:
                System.out.print("Πόσα αστερια θέλεις για την πυραμίδα 1 έως n; ");
                n = inputUser();
                starsIncreasing(n);
                break;
            case 5:
                System.out.print("Πόσα αστερια θέλεις για την πυραμίδα n έως 1; ");
               n = inputUser();
                starsDecreasing(n);
                break;
            case 6:
                System.out.print("Σας ευχαριστουμε που χρησιμοποιησατε την εφαρμογη μας");
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