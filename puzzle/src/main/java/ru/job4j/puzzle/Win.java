package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (checkRow(board, i) || checkColumn(board, i)) {
                rsl = true;
                break;
            }
        }

        return rsl;
    }

    public static boolean checkRow(int[][] board, int row) {
        boolean rsl = false;
        int count = 0;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == 1) {
                count++;
                if (count == board[row].length) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean checkColumn(int[][] board, int column) {
        boolean rsl = false;
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 1) {
                count++;
                if (count == board.length) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }
}
