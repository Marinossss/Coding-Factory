package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ArrayExercise3 {
    static Scanner in = new Scanner(System.in);
    static int count = 0;
    static int oddcount = 0;

    public static void main(String[] args) {
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please give me number " + (i + 1) + " (between 1 and 49): ");
            arr[i] = in.nextInt();

            while (arr[i] < 1 || arr[i] > 49) {
                System.out.println("Invalid number. Please give a number between 1 and 49: ");
                arr[i] = in.nextInt();
            }

            checkTensFrequency(arr, i);

            checkConsecutive(arr, i);

            checkEndingFrequency(arr, i);

            if (arr[i] % 2 == 0) {
                evens(arr, i);
            }

            if (arr[i] % 2 != 0) {
                odds(arr, i);
            }
        }

        System.out.println("Final array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void evens(int[] arr, int index) {
        count++;

        if (count > 3) {
            System.out.println("I can accept only 3 even numbers. Please give a new odd number:");
            arr[index] = in.nextInt();

            while (arr[index] < 1 || arr[index] > 49 || arr[index] % 2 == 0) {
                System.out.println("Invalid number. Please give a valid odd number (1 to 49): ");
                arr[index] = in.nextInt();
            }


            count--;
        }
    }

    public static void odds(int[] arr, int index) {
        oddcount++;

        if (oddcount > 3) {
            System.out.println("I can accept only 3 odd numbers. Please give a new even number:");
            arr[index] = in.nextInt();

            while (arr[index] < 1 || arr[index] > 49 || arr[index] % 2 == 0) {
                System.out.println("Invalid number. Please give a valid odd number (1 to 49): ");
                arr[index] = in.nextInt();
            }


            oddcount--;
        }
    }

    public static void checkConsecutive(int[] arr, int index) {
        // Διατρέχουμε όλη τη λίστα ξεκινώντας από το index 2 (γιατί θέλουμε τουλάχιστον 3 αριθμούς για να ελέγξουμε)
        for ( int i = 2; i < arr.length; i++) {
            // Ελέγχουμε αν τα 3 διαδοχικά στοιχεία είναι συνεχόμενα
            if (arr[i] - 1 == arr[i - 1] && arr[i - 1] - 1 == arr[i - 2]) {
                System.out.println("You cannot enter 3 consecutive numbers starting from index " + (i - 2) + ". Please enter a new number for index " + i + ":");

                // Ζητάμε από τον χρήστη να εισάγει νέο αριθμό στη θέση i
                arr[i] = in.nextInt();


                // Επαναλαμβάνουμε τον έλεγχο αν τα τρία συνεχόμενα είναι σωστά
                i = 1;
            }
        }
    }

    public static void checkEndingFrequency(int[] arr, int index) {
        int[] endings = new int[10]; // Πίνακας για τους λήγοντες (0-9)

        // Υπολογισμός συχνοτήτων για τους αριθμούς που έχουν ήδη εισαχθεί
        for (int i = 0; i < index; i++) {
            int ending = arr[i] % 10;
            endings[ending]++;
        }

        // Εύρεση λήγοντα του νέου αριθμού
        int currentEnding = arr[index] % 10;

        // Έλεγχος αν ο λήγοντας εμφανίζεται ήδη 3 φορές
        if (endings[currentEnding] >= 3) {
            System.out.println("You cannot enter more than 3 numbers with the same last digit. Please enter a new number:");
            arr[index] = in.nextInt();

        }

    }

    public static void checkTensFrequency(int[] arr, int index) {
        int[] tens = new int[10]; // Πίνακας για τις δεκάδες (0-9, αντιπροσωπεύει 0-9, 10-19, ..., 90-99)

        // Υπολογισμός συχνοτήτων για τις δεκάδες των αριθμών που έχουν ήδη εισαχθεί
        for (int i = 0; i < index; i++) {
            int tensGroup = arr[i] / 10; // Υπολογίζουμε τη δεκάδα διαιρώντας τον αριθμό με το 10
            tens[tensGroup]++;
        }

        // Υπολογίζουμε τη δεκάδα του τρέχοντος αριθμού
        int currentTensGroup = arr[index] / 10;
        tens[currentTensGroup]++;

        // Αν υπάρχουν πάνω από 3 αριθμοί στη συγκεκριμένη δεκάδα, ζητάμε νέο αριθμό
        while (tens[currentTensGroup] > 3) {
            System.out.println("You cannot have more than 3 numbers in the same tens group ("
                    + (currentTensGroup * 10) + "-" + (currentTensGroup * 10 + 9) + "). "
                    + "Please enter a new number:");

            arr[index] = in.nextInt();

            // Επαναυπολογίζουμε τη δεκάδα και τις συχνότητες
            currentTensGroup = arr[index] / 10;
            tens = new int[10]; // Επαναφέρουμε τον πίνακα συχνοτήτων
            for (int i = 0; i <= index; i++) {
                tens[arr[i] / 10]++;
            }
        }
    }
}