public class NQueens {

    static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe(int[][] board, int row, int col, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        //  upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    static void nQueens(int[][] board, int row, int n) {

        // Base Case
        if (row == n) {
            printBoard(board, n);
            return;
        }

        // Recursive Case
        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                board[row][col] = 1;      

                nQueens(board, row + 1, n);

                board[row][col] = 0;      // Backtracking
            }
        }
    }

    public static void main(String[] args) {

        int n = 8; 

        int[][] board = new int[n][n];

        nQueens(board, 0, n);
    }
}