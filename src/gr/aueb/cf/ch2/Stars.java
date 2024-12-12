package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Stars {

    public static void main(String[] args) {
        int n = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλω πληκτρολογιστε ποσα αστερια θελετε (οριζοντια): ");
        n = in.nextInt();

        printStartsInRow(n);

        System.out.println("Παρακαλω πληκτρολογιστε ποσα αστερια θελετε (καθετα): ");
        n = in.nextInt();
        printStarsInColum(n);

        System.out.println("Παρακαλω εισαγεται ποσα αστερια θελετε (1XN): ");
        n = in.nextInt();
        starsIncreasing(n);

        System.out.println("Παρακαλω εισαγεται ποσα αστερια θελετε(NXN): ");
        n=in.nextInt();
        nxnStars(n);

        System.out.println("Παρακαλω εισαγεται ποσα αστερια θελετε(NX1");
        n=in.nextInt();
        starsDecreasing(n);

    }

    public static void printStartsInRow(int n){

        for (int i = 1; i <= n; i++) {

            System.out.print("*");
        }

        System.out.println();
    }

    public static void printStarsInColum(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void starsIncreasing(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


   public static void nxnStars(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
   }

    public static void starsDecreasing(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

