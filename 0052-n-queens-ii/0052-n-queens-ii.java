class Solution {
    public int totalNQueens(int n) {
        
        char[][] board = new char[n][n];
		
		// filled the whole 2d array with 'X' which indicates that no queen is placed there
		for(char[] b : board)
		{
			Arrays.fill(b, 'X');
		}
		
		int cnt = nQueen(board, 0, 0);
        return cnt;
    }

    private static int nQueen(char[][] board, int row, int cnt) {

		int n = board.length;
		
		if(row == n)
		{
            cnt++;
			return cnt;
		}
		
		for(int j = 0; j < n; j++)
		{
			if(isSafe(board, row, j))
			{
				board[row][j] = 'Q';
				cnt = nQueen(board, row+1, cnt);		// call
				board[row][j] = 'X';		            // backtrack
			}
		}
        return cnt;
	}

	private static boolean isSafe(char[][] board, int row, int col) {

		int n = board.length;
		
		// check row
		for(int j = 0; j < n; j++)
		{
			if(board[row][j] == 'Q') return false;
		}
		
		// check col
		for(int i = 0; i < n; i++)
		{
			if(board[i][col] == 'Q') return false;
		}
				
		// checking all diagonals
		// 1. checking North East
		int i = row, j = col;
		while(i >= 0 && j < n)
		{
			if(board[i][j] == 'Q')	return false;
			i--; j++;
		}
		
		// 2. checking South East
		i = row;
		j = col;
		while(i < n && j < n)
		{
			if(board[i][j] == 'Q')	return false;
			i++; j++;
		}
				
		// 3. checking South West		
		i = row; j = col;
		while(i < n && j >= 0)
		{
			if(board[i][j] == 'Q')	return false;
			i++; j--;
		}
				
		// 4. checking North West
		i = row; j = col;
		while(i >= 0 && j >= 0)
		{
			if(board[i][j] == 'Q')	return false;
			i--; j--;
		}
		
		return true;
	}

}