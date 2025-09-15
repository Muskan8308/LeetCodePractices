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
        
        long[][] dp = new long[coins.length][amount+1];
    	for(long[] arr : dp)
    		Arrays.fill(arr, -1);
    	
        int ans = (int)coinCount(coins.length-1, coins, amount, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}