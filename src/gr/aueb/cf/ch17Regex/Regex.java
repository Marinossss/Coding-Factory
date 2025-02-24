package gr.aueb.cf.ch17Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#!?$%^&])[A-Za-z0-9#!?$%^&]{8,}$";

        Pattern pattern = Pattern.compile(regex);

        while (true) {
            System.out.println("Insert your password: ");
            String password = in.nextLine();
            Matcher matcher = pattern.matcher(password);

            if (matcher.matches()) {
                System.out.println("The password is correct.");
                break;
            } else {
                System.out.println("The password is not correct.");
            }
        }
    }
}
