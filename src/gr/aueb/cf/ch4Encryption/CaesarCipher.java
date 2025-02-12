package gr.aueb.cf.ch4Encryption;

import java.util.Scanner;

public class CaesarCipher {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int shiftKey;
        String inputText;

        System.out.println("Enter the string to be encrypted: ");
        inputText = scanner.nextLine();
        System.out.println("Enter the number of positions to shift: ");
        shiftKey = scanner.nextInt();

        System.out.println("Encrypted text: " + caesarEncrypt(inputText, shiftKey));
        System.out.println("Decrypted text: " + caesarDecrypt(inputText, shiftKey));
    }

    public static String caesarEncrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            char encryptedChar = (char) (currentChar + key);
            encryptedText.append(encryptedChar);
        }
        return encryptedText.toString();
    }

    public static String caesarDecrypt(String text, int key) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            char decryptedChar = (char) (currentChar - key);
            decryptedText.append(decryptedChar);
        }
        return decryptedText.toString();
    }
}
