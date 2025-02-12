package gr.aueb.cf.ch2InitialSteps;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        int result = 0;

        System.out.println("Give first number: ");
        a = in.nextInt();
        System.out.println("Give second number: ");
        b = in.nextInt();
        System.out.println("Give third number: ");
        c = in.nextInt();
        result = math(a, b, c);
        System.out.println("The biggest number is: " + result);


    }

    static public int math(int a, int b,int c) {

         return Math.max(a, Math.max(b, c));

    }
}
