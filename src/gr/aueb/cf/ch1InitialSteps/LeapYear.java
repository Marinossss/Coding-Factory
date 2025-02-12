package gr.aueb.cf.ch1InitialSteps;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please insert Year: ");
        year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            System.out.println("True");
        } else {
            System.out.println("fails");
        }
    }
}
