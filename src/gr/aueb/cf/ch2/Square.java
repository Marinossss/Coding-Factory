package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        int inputUser;
        int result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert a number: ");
        inputUser = in.nextInt();
        result = square(inputUser);
        System.out.println("His square is: " + result);

    }

    static public int square(int inputUser) {
        int total = 0;

        total = inputUser * inputUser;
        return total;

    }
}
