package gr.aueb.cf.Christmas;

import java.util.Scanner;

public class Project4 {

    public static void main(String[] args) {
        int[][] board = new int[3][3];
        int currentPlayer = 1;

        Scanner in = new Scanner(System.in);

        while (true) {
            printBoard(board);
            System.out.println("Ο παιχτης " + currentPlayer + " (" + (currentPlayer == 1 ? 'X' : 'O') + "), its you turn.");

            try {
                System.out.print("Enter the row (0-2): ");
                int row = in.nextInt();
                System.out.println("Enter the column (0-2): ");
                int column = in.nextInt();

                if (row < 0 || row > 2 || column < 0 || column > 2) {
                    System.out.println("Το οριο ειναι απο (0 - 2)");
                }

                if (board[row][column] != 0) {
                    System.out.println("Αυτη η θεση εχει ηδη καλυφθει, Προσπαθηστε ξανα");
                }

                board[row][column] = currentPlayer;

                if (isWinner(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println("Συγχαρητηρια ο Παιχτης " + currentPlayer + " (" + (currentPlayer == 1 ? 'X' : 'O') + ") wins!");
                    break;
                }

                if (isDraw(board)) {
                    printBoard(board);
                    System.out.println("Ισοπαλια!");
                    break;
                }

                currentPlayer = 3 - currentPlayer;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter integers for row and column.");
                in.next();
            }
        }

    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                char symbol = cell == 0 ? ' ' : (cell == 1 ? 'X' : 'O');
                System.out.print(symbol + " | ");

            }
            System.out.println();
            System.out.println(new String(new char[9]).replace('\0', '-'));

        }
    }

    public static boolean isWinner(int[][] board, int player) {

        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }

    private static boolean isDraw(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
