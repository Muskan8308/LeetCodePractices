class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
    	
        for(int i = 0; i < dp.length; i++)
        {
            for(int j = 0; j < dp[0].length; j++)       // j = amount
            {
                int skip = (i > 0) ? dp[i-1][j] : ((j == 0) ? 1 : 0);    
                if(j - coins[i] < 0) dp[i][j] = skip;
                else 
                {
                    int take = dp[i][j - coins[i]];
                    dp[i][j] = take + skip;
                }
            }
        }

        return dp[n-1][amount];
    }

    public int countWays(int amount, int[] coins, int i, int[][] dp)
    {
        if(i == -1) return amount == 0 ? 1 : 0;   // 1 -> We found a valid sum of coins, 0 -> not found :(
        if(dp[i][amount] != -1) return dp[i][amount];

        int skip = countWays(amount, coins, i-1, dp);    
        if(amount - coins[i] < 0) return dp[i][amount] = skip;
        int take = countWays(amount - coins[i], coins, i, dp);

        return dp[i][amount] = take + skip;
    }
}