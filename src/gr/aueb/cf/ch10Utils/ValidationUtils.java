package gr.aueb.cf.ch10Utils;

public class ValidationUtils {

    public static boolean isValidStringLength(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return str.length() >= 1 && str.length() <= 31;
    }

    public static boolean isValidNumberRange (int number) {
        return number >= 1 && number <= 10;
    }
}
