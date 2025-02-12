package gr.aueb.cf.ch4Encryption;

import java.util.Scanner;

public class StringEncryption {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string to be encrypted: ");

        String userInput = scanner.nextLine();
        String encryptedNext = encryptNext(userInput);
        String encryptedPrevious = encryptPrevious(userInput);

        System.out.println("Encrypted string (incremented characters): " + encryptedNext);
        System.out.println("Encrypted string (decremented characters): " + encryptedPrevious);
    }

    public static String encryptNext(String input) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char encryptedChar = (char) (currentChar + 1);
            encrypted.append(encryptedChar);
        }

        return encrypted.toString();
    }

    public static String encryptPrevious(String input) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char encryptedChar = (char) (currentChar - 1);
            encrypted.append(encryptedChar);
        }

        return encrypted.toString();
    }
}
