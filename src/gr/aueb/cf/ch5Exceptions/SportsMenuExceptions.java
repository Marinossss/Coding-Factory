package gr.aueb.cf.ch5Exceptions;

import java.util.Scanner;

public class SportsMenuExceptions {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userChoice;

        while (true) {
            try {
                displayMenu();
                userChoice = getUserInput();
                handleUserChoice(userChoice);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void displayMenu() {
        System.out.println("1. Basketball");
        System.out.println("2. Football");
        System.out.println("3. Volleyball");
        System.out.println("4. Table Tennis");
        System.out.println("5. Exit");
    }

    public static int getUserInput() {
        if (!scanner.hasNextInt()) {
            scanner.next();
            throw new IllegalArgumentException("Invalid input. Please enter a number.");
        }

        int choice = scanner.nextInt();
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Invalid choice. Please select a number between 1 and 5.");
        }

        return choice;
    }

    public static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("You selected Basketball.");
                break;
            case 2:
                System.out.println("You selected Football.");
                break;
            case 3:
                System.out.println("You selected Volleyball.");
                break;
            case 4:
                System.out.println("You selected Table Tennis.");
                break;
            case 5:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
        }
    }
}
