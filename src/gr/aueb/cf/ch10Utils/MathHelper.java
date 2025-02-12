package gr.aueb.cf.ch10Utils;

public class MathHelper {




    public static int getMinValue (int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array must not be null or empty");
        }

        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int getMaxValue (int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array must not be null or empty");

        }
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                   maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int calculateSum(int [] arr) {
        int sum = 0;

        for ( int el : arr) {
        sum += el;
        }
        return sum;
    }


    public static int calculateAverage(int[] arr) {

        if (arr == null || arr.length ==0) {
            throw new IllegalArgumentException("The array must not be null or empty");
        }

        return calculateSum(arr) / arr.length;
    }
}
