class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        return isValid(grid, 0, 0, 0);
    }

    private boolean isValid(int[][] grid, int row, int col, int num)
    {
        int n = grid.length;

        // base case
        if(grid[row][col] == n*n - 1)
        return true;

        int i, j;
        
        // 2U1L
        i = row - 2;
        j = col-1;
        if(i >= 0 && j >= 0 && grid[i][j] == num+1) return isValid(grid, i, j, num+1);

        // 2U1R
        i = row - 2;
        j = col+1;
        if(i >= 0 && j < n && grid[i][j] == num+1) return isValid(grid, i, j, num+1);
   
        // 2D1L
        i = row + 2;
        j = col-1;
        if(i < n && j >= 0 && grid[i][j] == num+1) return isValid(grid, i, j, num+1);
   
        // 2D1R
        i = row + 2;
        j = col + 1;
        if(i < n && j < n && grid[i][j] == num+1) return isValid(grid, i, j, num+1);
   
        // 2R1U
        i = row - 1;
        j = col + 2;
        if(i >= 0 && j < n && grid[i][j] == num+1) return isValid(grid, i, j, num+1);

        // 2R1D
        i = row + 1;
        j = col + 2;
        if(i < n && j < n && grid[i][j] == num+1) return isValid(grid, i, j, num+1);
   
        // 2L1U
        i = row - 1;
        j = col - 2;
        if(i >= 0 && j >= 0 && grid[i][j] == num+1) return isValid(grid, i, j, num+1);
   
        // 2L1D
        i = row + 1;
        j = col - 2;
        if(i < n && j >= 0 && grid[i][j] == num+1) return isValid(grid, i, j, num+1);
   
        return false;
    }
}