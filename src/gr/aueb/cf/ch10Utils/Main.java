package gr.aueb.cf.ch10Utils;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        logger.logMessage("This is a log Message!");

        int []arr;
        arr = new int[] {13, 23, 11, 56, 2};
        int num = 4;

        System.out.println(MathHelper.getMaxValue(arr));
        System.out.println(MathHelper.getMinValue(arr));
        System.out.println(MathHelper.calculateAverage(arr));
        System.out.println("----------");

        String str = "A man a plan a canal Panama!";
        System.out.println(StringUtils.isPalindrome(str));
        System.out.println(StringUtils.toUpperCase(str));
        System.out.println(StringUtils.reverse(str));
        System.out.println("--------------------");
        System.out.println(ValidationUtils.isValidNumberRange(num));
        System.out.println(ValidationUtils.isValidStringLength(str));

    }


}
