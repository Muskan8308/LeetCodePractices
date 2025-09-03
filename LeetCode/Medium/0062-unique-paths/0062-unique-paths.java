class Solution {
    
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];
        for(int[] arr : dp)
        Arrays.fill(arr, -1);

        return paths(0, 0, m, n, dp);   
    }

    public int paths(int i, int j, int m, int n, int[][] dp) {
        
        if(i >= m || j >= n) return 0;
        if(i == m-1 && j == n-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        return dp[i][j] = paths(i, j+1, m, n, dp) + paths(i+1, j, m, n, dp);
    }
}