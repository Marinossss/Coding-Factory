package gr.aueb.cf.ch2;

import java.util.Scanner;

public class IsPrimee {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputUser = 0;
        boolean result;

        System.out.println("Please insert a number so i tell you if it is prime or not: ");
        inputUser = in.nextInt();
        result = isPrime(inputUser);

        if (result) {
            System.out.println(inputUser + " is a prime number");
        } else {
            System.out.println(inputUser + "is not a prime number");
        }
    }

    static public boolean isPrime(int inputUser) {

        if(inputUser <= 1) {
            return false;
        }

        for(int i = 2; i < inputUser; i++) { //κανει τοσες επαναληψεις μεχρι να βρει 0 και τοτε ειναι false
            if (inputUser % i == 0) { // Αν πχ εχουμε δωσει 5 θα τρεξει μεχρι 4 οποτε δεν θα βρει ποτε ==0οποτε true
                return false; //αν δωσουμε 15 στο i=3 θα βρει 0 αρα false
            }
        }

        return true;

    }
}
