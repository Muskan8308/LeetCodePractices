class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;

                char num = board[i][j];
                board[i][j] = '.';
                if (!isValid(board, i, j, num))
                    return false;
                board[i][j] = num;         
            }
        }
        return true;
    }

    boolean isValid(char[][] board, int row, int col, char num) {
        // check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num)
                return false;
        }

        // check col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num)
                return false;
        }

        // check 3 x 3 grid
        int sRow = row / 3 * 3, sCol = col / 3 * 3;

        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        // Num is not present at all i.e Num is at its valid position
        return true;
    }
}