class Solution {
    public int minPathSum(int[][] grid) {
        
        int[][] dp = grid;
        int m = grid.length, n = grid[0].length;

        // when row = 0, making prefix sum
        for(int j = 1; j < n; j++)
        dp[0][j] += dp[0][j-1];

        // when col = 0, making prefix sum
        for(int i = 1; i < m; i++)
        dp[i][0] += dp[i-1][0];

        // tabulation
        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                dp[i][j] = dp[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[m-1][n-1];
    }
}