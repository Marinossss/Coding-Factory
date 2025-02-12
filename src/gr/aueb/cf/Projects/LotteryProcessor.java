package gr.aueb.cf.Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileWriter;

public class LotteryProcessor {

    static boolean shouldStopProcessing = false;

    public static void main(String[] args) {

        File inputFile = new File("C:/tmp/numbers.txt");
        File outputFile = new File("C:/tmp/numbers-formated.txt");
        String line;
        String[] tokens;

        ArrayList<Integer> numbersList = new ArrayList<>();

        try (Scanner in = new Scanner(inputFile)) {

            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    try {
                        int number = Integer.parseInt(token);
                        System.out.print(number + " ");
                        numbersList.add(number);

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number: " + token);
                    }
                }
            }

            // Convert ArrayList to array
            int[] numbersArray = numbersList.stream().mapToInt(i -> i).toArray();
            sort(numbersArray);

            System.out.println("\nSorted numbers:");
            for (int num : numbersArray) {
                System.out.print(num + " ");
            }

            int n = numbersArray.length;
            FileWriter writer = new FileWriter(outputFile);

            for (int i = 0; i < n - 5; i++) {
                for (int j = i + 1; j < n - 4; j++) {
                    for (int k = j + 1; k < n - 3; k++) {
                        for (int l = k + 1; l < n - 2; l++) {
                            for (int m = l + 1; m < n - 1; m++) {
                                for (int o = m + 1; o < n; o++) {
                                    int[] combination = {numbersArray[i], numbersArray[j], numbersArray[k],
                                            numbersArray[l], numbersArray[m], numbersArray[o]};
                                    shouldStopProcessing = false;
                                    checkConsecutive(combination);
                                    checkEvens(combination);
                                    checkOdds(combination);
                                    checkLastDigit(combination);
                                    checkTens(combination);

                                    if (!shouldStopProcessing) {
                                        System.out.println("Valid combination: " + combination[0] + " " + combination[1] + " "
                                                + combination[2] + " " + combination[3] + " " + combination[4] + " "
                                                + combination[5]);

                                        writer.write(combination[0] + " " + combination[1] + " " + combination[2] + " "
                                                + combination[3] + " " + combination[4] + " " + combination[5] + "\n");
                                    }
                                }
                            }
                        }
                    }
                }
            }

            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkConsecutive(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2]) {
                System.out.println("I can accept at most two consecutive numbers.");
                shouldStopProcessing = true;
            }
        }
    }

    public static void checkEvens(int[] combination) {
        int evenCount = 0;
        for (int num : combination) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        if (evenCount > 4) {
            System.out.println("I can have at most 4 even numbers.");
            shouldStopProcessing = true;
        }
    }

    public static void checkOdds(int[] combination) {
        int oddCount = 0;
        for (int num : combination) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount > 4) {
            System.out.println("I can have at most 4 odd numbers.");
            shouldStopProcessing = true;
        }
    }

    // Check for the last digit of the numbers
    public static void checkLastDigit(int[] combination) {
        HashMap<Integer, Integer> lastDigitCount = new HashMap<>();
        for (int num : combination) {
            int lastDigit = num % 10;
            lastDigitCount.put(lastDigit, lastDigitCount.getOrDefault(lastDigit, 0) + 1);
        }
        for (int count : lastDigitCount.values()) {
            if (count > 3) {
                System.out.println("No more than 3 numbers with the same last digit are allowed.");
                shouldStopProcessing = true;
                break;
            }
        }
    }

    // Check for the same tens range (e.g., 10-19, 20-29, etc.)
    public static void checkTens(int[] combination) {
        HashMap<Integer, Integer> tensCount = new HashMap<>();
        for (int num : combination) {
            int tens = num / 10;
            tensCount.put(tens, tensCount.getOrDefault(tens, 0) + 1);
        }
        for (int count : tensCount.values()) {
            if (count > 3) {
                System.out.println("No more than 3 numbers in the same tens range are allowed.");
                shouldStopProcessing = true;
                break;
            }
        }
    }

    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
