package gr.aueb.cf.ch3Arrays;

public class ArrayExercise4 {

    public static void main(String[] args) {

        int[] arr;
        arr = new int[] {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;
        int positionMin = -1;
        int positionMax = -1;


        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                positionMin = i;
                break;
            }

        }

        for (int i = positionMin; i < arr.length; i++) {
            if (key == arr[i]) {
                positionMax = i;
            }

        }
        System.out.println("The min is: " + positionMin);
        System.out.println("The min is: " + positionMax);

        int[] array = getLowAndHighIndexOf(arr, 4);
        System.out.println("Low is: " + array[0]);
        System.out.println("Max is: " + array[1]);
    }


    public static  int[] getLowAndHighIndexOf(int[] arr, int key) {
        int lowPosition = 0;
        int maxPosition =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lowPosition = i;
                break;
            }

        }

        for (int i = lowPosition; i < arr.length; i++) {
            if (arr[i] == key) {
                maxPosition = i;
            }
        }

        return new int[] {lowPosition, maxPosition};
    }
}
