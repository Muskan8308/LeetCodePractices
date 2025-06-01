class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
		
		// filled the whole 2d array with 'X' which indicates that no queen is placed there
		for(char[] b : board)
		{
			Arrays.fill(b, '.');
		}
		List<List<String>> ans = new ArrayList<>();
		nQueen(board, 0, ans);
        return ans;
    }

    private static void nQueen(char[][] board, int row, List<List<String>> ans) {

		int n = board.length;
		// base case
		if(row == n)
		{
			// copying the 2d array into list of string

            List<String> list = new ArrayList<>();
            for(int i = 0; i < n; i++)
            {
                StringBuilder str = new StringBuilder("");
                for(int j = 0; j < n; j++)
                {
                    str.append(board[i][j]);
                }
                list.add(str.toString());
            }
            ans.add(list);
			return;
		}
		
		for(int j = 0; j < n; j++)
		{
			if(isSafe(board, row, j))
			{
				board[row][j] = 'Q';
				nQueen(board, row+1, ans);		// call
				board[row][j] = '.';		// backtrack
			}
		}
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