class Solution {
    public int change(int amount, int[] coins) {
        
        int[][] dp = new int[coins.length][amount+1];
    	for(int[] arr : dp)
    	Arrays.fill(arr, -1);

        return countWays(amount, coins, 0, dp);
    }

    public int countWays(int amount, int[] coins, int i, int[][] dp)
    {
        if(i == coins.length) return amount == 0 ? 1 : 0;   // 1 -> We found a valid sum of coins, 0 -> not found :(
        if(dp[i][amount] != -1) return dp[i][amount];

        int skip = countWays(amount, coins, i+1, dp);    
        if(amount - coins[i] < 0) return dp[i][amount] = skip;
        int take = countWays(amount - coins[i], coins, i, dp);

        return dp[i][amount] = take + skip;
    }
}