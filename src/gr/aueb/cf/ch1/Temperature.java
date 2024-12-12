package gr.aueb.cf.ch1;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inputUser,totalC;
        int celCious = 5;


        System.out.println("Insert the temperature Fahrenheit so order to convert to C: ");

        inputUser = in.nextInt();

        totalC = celCious * (inputUser-32) / 9;

        System.out.printf("The temperature %d Fahreheit is %d in Celsius", inputUser,totalC);
    }
}
