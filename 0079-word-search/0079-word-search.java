class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(isExist(board, word, i, j, 0))
                return true;
            }
        }

        return false;
    }

    private boolean isExist(char[][] board, String word, int row, int col, int idx)
    {
        int m = board.length;
        int n = board[0].length;
        
        // base case
        if(idx == word.length())
        {
            return true;
        }

        if(row >= m || row < 0 || col < 0  || col >= n || board[row][col] != word.charAt(idx))
        return false;

        char ch = board[row][col];
        board[row][col] = '.';     // marked visited

        boolean found = isExist(board, word, row+1, col, idx+1) ||     // Right
                        isExist(board, word, row-1, col, idx+1) ||     // Left
                        isExist(board, word, row, col+1, idx+1) ||     // Down
                        isExist(board, word, row, col-1, idx+1);       // Up

        board[row][col] = ch;       // backtrack
        return found;
    }
}