package gr.aueb.cf.ch5Exceptions;

import java.util.Scanner;

public class BankExceptionHandler {

    static double accountBalance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Simple Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        deposit(depositAmount);
                        System.out.println("Your total balance is: " + accountBalance + "$.");
                    } catch (IllegalArgumentException e) {
                        System.err.println("Transaction failed. Invalid deposit amount.");
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdraw(withdrawAmount);
                        System.out.println("Your total balance is: " + accountBalance + "$.");
                    } catch (IllegalArgumentException e) {
                        System.err.println("Transaction failed. Invalid withdrawal amount or insufficient funds.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + accountBalance + "$.");
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Bank. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void withdraw(double amount) {
        if (amount <= 0 || amount > accountBalance) {
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        }
        accountBalance -= amount;
    }

    public static void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount.");
        }
        accountBalance += amount;
    }
}
