class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        
        int m = grid.length, n = grid[0].length;

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == 1) grid[i][j] = -1;
                else grid[i][j] = -2;
            }
        }

        return uniquePaths(0, 0, m, n, grid);

    }

    public int uniquePaths(int i, int j, int m, int n, int[][] dp) {
        
        if(i >= m || j >= n) return 0;
        if(i == m-1 && j == n-1) return 1;
        if(dp[i][j] == -1) return 0;
        else if(dp[i][j] != -2) return dp[i][j];

        return dp[i][j] = uniquePaths(i, j+1, m, n, dp) + uniquePaths(i+1, j, m, n, dp);

    }
}