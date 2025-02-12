package gr.aueb.cf.ch3Arrays;

public class ArrayExercise5 {

    public static void main(String[] args) {

        int[][] arr = { { 1012, 1136 }, { 1317, 1417 }, { 1015, 1020 } };


        int[] arrivals = new int[arr.length];
        int[] departures = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrivals[i] = arr[i][0];
            departures[i] = arr[i][1];
        }


        arrivals = sorted(arrivals);
        departures = sorted(departures);




        int i = 0, j = 0;
        int currentCars = 0;
        int maxCars = 0;

        while (i < arrivals.length && j < departures.length) {
            if (arrivals[i] <= departures[j]) {
                currentCars++;
                maxCars = Math.max(maxCars, currentCars);
                i++;
            } else {
                currentCars--;
                j++;
            }
        }

        System.out.println("The maximum number of cars in the parking lot at the same time is: " + maxCars);
    }


    public static int[] sorted(int []arr) {

        for (int i = arr.length -1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }

        }

        return arr;
    }


    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a]= arr[b];
        arr[b] = tmp;

    }
}