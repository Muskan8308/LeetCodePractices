class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        // Tabulation 
        int n = cost.length;
        int[] dp = new int[3];
        dp[2] = cost[n-1]; 
        dp[1] = cost[n-2];

        for(int i = n-3; i >= 0; i--)
        {
            dp[0] = cost[i] + Math.min(dp[1], dp[2]);
            dp[2] = dp[1];
            dp[1] = dp[0];
        }

        return Math.min(dp[2], dp[1]);
    }
}