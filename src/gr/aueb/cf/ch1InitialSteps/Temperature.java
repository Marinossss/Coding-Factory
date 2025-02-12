package gr.aueb.cf.ch1InitialSteps;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inputUser,totalC;
        int celCious = 5;


        System.out.println("Insert the temperature in Fahrenheit so I can convert it(C): ");

        inputUser = in.nextInt();

        totalC = celCious * (inputUser-32) / 9;

        System.out.printf("The temperature is: %d C",totalC);
    }
}
