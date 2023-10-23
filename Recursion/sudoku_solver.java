package Recursion;

public class sudoku_solver {
    public static void main(String[] args) {
        char[][] board = {
                { '.', '.', '5', '1', '.', '.', '7', '4', '9' },
                { '.', '8', '.', '.', '3', '.', '.', '.', '.' },
                { '.', '.', '9', '.', '.', '.', '.', '.', '8' },
                { '.', '.', '6', '.', '2', '3', '.', '.', '.' },
                { '8', '9', '.', '4', '5', '1', '.', '2', '7' },
                { '.', '.', '.', '9', '7', '.', '1', '.', '.' },
                { '1', '.', '.', '.', '.', '.', '4', '.', '.' },
                { '.', '.', '.', '.', '8', '.', '.', '3', '.' },
                { '9', '3', '4', '.', '.', '5', '8', '.', '.' }
        };
        solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static boolean solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) {
                return false;
            }
            if (board[row][i] == c) {
                return false;
            }
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
                return false;
            }
        }
        return true;
    }
}