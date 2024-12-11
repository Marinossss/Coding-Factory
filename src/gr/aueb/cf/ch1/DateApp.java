package gr.aueb.cf.ch1;

import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int yPutDate, yPutMonth, yPutDay;
        System.out.println("Insert Date: ");
        yPutDay = in.nextInt();
        yPutMonth = in.nextInt();
        yPutDate = in.nextInt();

        System.out.printf("Η ημερομηνια ειναι %02d/%02d/%d",yPutDay, yPutMonth, yPutDate);
    }
}
