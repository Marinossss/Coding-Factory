package gr.aueb.cf.ch3;

public class ArrayExercise2 {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[] {2, 14, 9, 12, 2};
        int[] newArr;
        newArr = mapping(arr);

        System.out.print("The position of number is: " + search(arr,12));

        System.out.println();

        evens(arr);

        System.out.println();

        for (int el : newArr) {
            System.out.print(el + " ");
        }

        System.out.println();
        System.out.println(thereIsOneOfALL(arr));
        System.out.println(thereIs(arr));

    }

    public static int search(int[] arr, int number) {


        int position = 0;
        for(int i =0; i < arr.length -1;i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void evens(int[] arr) {

        for ( int el : arr) {
            if (el % 2 == 0) {
                System.out.print("is even: " + el + " ");
            }
        }
    }

    public static int[] mapping (int[] arr) {

        int[] mapped = new int[arr.length];

        for(int i =0; i < arr.length; i++) {
           mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static boolean thereIsOneOfALL(int[] arr) {

        for (int el : arr) {
            if (el  > 0) {
                return true;
            }

        }
        return false;
    }

    public static boolean thereIs(int[] arr) {

        for (int el : arr) {
            if (el  < 0) {
                return false;
            }

        }
        return true;
    }
}
