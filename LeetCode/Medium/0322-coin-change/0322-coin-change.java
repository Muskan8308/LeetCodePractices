class Solution {
    public long coinCount( int i, int[] coins, int amount, long[][] dp) {
        
        // n-1 to 0
        if(i == -1) 
        {
            if(amount == 0) return 0; 			// no count is needed
            else return Integer.MAX_VALUE;		// invalid count
        }
        
        if(dp[i][amount] != -1) return dp[i][amount];

        long skip = coinCount(i-1, coins, amount, dp);
        if(amount - coins[i] < 0) return dp[i][amount] = skip;
        long take = 1 + coinCount(i, coins, amount - coins[i], dp);
        return dp[i][amount] = Math.min(skip, take);


    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount+1];
    	
        for(int i = 0; i < dp.length; i++)
        {
            for(int j = 0; j < dp[0].length; j++)
            {
                long skip = (i > 0) ? dp[i-1][j] : ((j == 0) ? 0 : Integer.MAX_VALUE);
                if(j - coins[i] < 0) dp[i][j] = skip;
                else 
                {
                    long take = 1 + dp[i][j - coins[i]];
                    dp[i][j] = Math.min(skip, take);
                }
            }
        }

        int ans = (int) dp[n-1][amount];
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}