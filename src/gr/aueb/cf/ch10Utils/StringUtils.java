package gr.aueb.cf.ch10Utils;

public class StringUtils {


    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }

        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = reverse(cleanedStr);
        return cleanedStr.equals(reversedStr);
    }


    public static String toUpperCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }

        return str.toUpperCase();
    }

    public static String reverse (String str) {

        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() -1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
