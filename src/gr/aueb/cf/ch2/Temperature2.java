package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Temperature2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double choice;

        System.out.println("Please insert the temperature(Celsius) so we can convert it to degrees Fahrenheit: ");
        choice = inputUser();
        celsiusToFahrenheit(choice);

    }

    static public double celsiusToFahrenheit(double index ) {
        double convertToCelsius = 0;

        convertToCelsius = index * 9 / 5 + 32;
        System.out.println("The convert is" + convertToCelsius);
        return convertToCelsius;
    }

    public static double inputUser() {
        return in.nextDouble();
    }



}