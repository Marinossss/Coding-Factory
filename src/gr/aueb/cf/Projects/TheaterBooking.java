package gr.aueb.cf.Projects;

public class TheaterBooking {

    static final int ROWS = 30;
    static final int COLUMNS = 12;

    public static void main(String[] args) {
        boolean[][] theater = new boolean[ROWS][COLUMNS];

        bookSeat(theater, 'C', 1);
        displayTheater(theater);
        cancelBooking(theater, 'C', 1);
        displayTheater(theater);
    }

    public static void bookSeat(boolean[][] theater, char column, int row) {
        int columnIndex = column - 'A';

        if (columnIndex < 0 || columnIndex >= COLUMNS || row < 1 || row > ROWS) {
            System.out.println("The seat " + column + row + " is out of bounds.");
            return;
        }

        if (!theater[row - 1][columnIndex]) {
            theater[row - 1][columnIndex] = true;
            System.out.println("The seat " + column + row + " has been successfully booked.");
        } else {
            System.out.println("The seat " + column + row + " is already booked.");
        }
    }

    public static void cancelBooking(boolean[][] theater, char column, int row) {
        int columnIndex = column - 'A';

        if (columnIndex < 0 || columnIndex >= COLUMNS || row < 1 || row > ROWS) {
            System.out.println("The seat " + column + row + " is out of bounds.");
            return;
        }

        if (theater[row - 1][columnIndex]) {
            theater[row - 1][columnIndex] = false;
            System.out.println("\nThe seat " + column + row + " has been successfully canceled.");
        } else {
            System.out.println("The seat " + column + row + " is not booked.");
        }
    }

    public static void displayTheater(boolean[][] theater) {
        System.out.println("Theater Status:");

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(theater[i][j] ? "X" : "O" + "-");
            }
            System.out.println();
        }
    }
}
