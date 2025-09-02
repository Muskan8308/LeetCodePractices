class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return climbs(n, dp);
    }

    private int climbs(int n, int[] dp)
    {
        if(n <= 2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = climbs(n-1, dp) + climbs(n-2, dp);
    }
}