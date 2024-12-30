package gr.aueb.cf.Christmas;

public class Project5 {

    static final int Rows = 30;
    static final int columns = 12;

    public static void main(String[] args) {
        boolean[][] theater = new boolean[Rows][columns];


        book(theater,'C', 1);
        displayTheater(theater);
        cancel(theater,'C', 1);
        displayTheater(theater);

    }

    public static void book(boolean[][] theater, char column, int row) {
        int columnIndex = column - 'A';

        if (columnIndex < 0 || columnIndex >= columns || row < 1 || row > Rows) {
            System.out.println("Η θεση " + column + row + " είναι εκτός ορίων");
            return;
        }

        if (!theater[row - 1][columnIndex]) {
            theater[row - 1][columnIndex] = true;
            System.out.println("Η θεση " + column + row + " κρατήθηκε επιτυχώς");
        }else {
            System.out.println("Η θέση " + column + row + " είναι κρατημένη.");
        }
    }

    public static void cancel(boolean[][] theater, char column, int row) {
        int columnIndex = column - 'A';

        if (columnIndex < 0 || columnIndex >= columns || row < 1 || row > Rows) {
            System.out.println("Η θεση " + column + row + " είναι εκτός ορίων");
            return;
        }

        if (theater[row - 1][columnIndex]) {
            theater[row - 1][columnIndex] = false;
            System.out.println("\nΗ θεση " + column + row + " ακυρωθηκε επιτυχώς");
        }else {
            System.out.println("Η θέση " + column + row + " δεν είναι κρατημένη.");
        }
    }

    public static void displayTheater(boolean[][] theater) {
        System.out.println("Κατασταση θεατρου");

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(theater[i][j] ? "X" : "O" + "-");
            }
        }
    }
}
