package gr.aueb.cf.ch3Arrays;

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

        for ( int i = 2; i < arr.length; i++) {

            if (arr[i] - 1 == arr[i - 1] && arr[i - 1] - 1 == arr[i - 2]) {
                System.out.println("You cannot enter 3 consecutive numbers starting from index " + (i - 2) + ". Please enter a new number for index " + i + ":");


                arr[i] = in.nextInt();



                i = 1;
            }
        }
    }

    public static void checkEndingFrequency(int[] arr, int index) {
        int[] endings = new int[10];


        for (int i = 0; i < index; i++) {
            int ending = arr[i] % 10;
            endings[ending]++;
        }


        int currentEnding = arr[index] % 10;


        if (endings[currentEnding] >= 3) {
            System.out.println("You cannot enter more than 3 numbers with the same last digit. Please enter a new number: ");
            arr[index] = in.nextInt();

        }

    }

    public static void checkTensFrequency(int[] arr, int index) {
        int[] tens = new int[10];


        for (int i = 0; i < index; i++) {
            int tensGroup = arr[i] / 10;
            tens[tensGroup]++;
        }


        int currentTensGroup = arr[index] / 10;
        tens[currentTensGroup]++;


        while (tens[currentTensGroup] > 3) {
            System.out.println("You cannot have more than 3 numbers in the same tens group ("
                    + (currentTensGroup * 10) + "-" + (currentTensGroup * 10 + 9) + "). "
                    + "Please enter a new number:");

            arr[index] = in.nextInt();


            currentTensGroup = arr[index] / 10;
            tens = new int[10];
            for (int i = 0; i <= index; i++) {
                tens[arr[i] / 10]++;
            }
        }
    }
}