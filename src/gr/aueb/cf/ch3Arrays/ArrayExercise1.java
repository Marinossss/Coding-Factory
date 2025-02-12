package gr.aueb.cf.ch3Arrays;

public class ArrayExercise1 {

    public static void main(String[] args) {

        int[] arr;
        arr = new int[] {1, 7, 6, 5};

        System.out.println("Position maxValues: " + getMaxPosition(arr,0, 4));

        int secondSmallestNumber = getTheSecondLittleNumber(arr);
        System.out.println("The secondSmallestNumber is: " + secondSmallestNumber);



    }

    public static int getMaxPosition (int []arr, int low, int high) {


        if (low < 0 || high > arr.length || low >= high) return -1;

        int maxPosition = 0;
        int value = 0;

        for (int i = low; i < high; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }

        }
        return maxPosition;
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

    public static void swap (int[] arr, int a, int b){

        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;

    }

    public static int getTheSecondLittleNumber(int[] arr) {

        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements");  return -1;
        }

        sorted(arr);

        return arr[1];

    }
}
