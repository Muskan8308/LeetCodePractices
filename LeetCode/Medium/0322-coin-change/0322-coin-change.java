class Solution {
    public long coinCount( int i, int[] coins, int amount) {
        
        if(i == coins.length) 
        {
            if(amount == 0) return 0; // no count is needed
            else return Integer.MAX_VALUE;
        }

        long skip = coinCount(i+1, coins, amount);
        if(amount - coins[i] < 0) return skip;
        long take = 1 + coinCount(i, coins, amount - coins[i]);
        return Math.min(skip, take);

    }

    public int coinChange(int[] coins, int amount) {
        
        int ans = (int)coinCount(0, coins, amount);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}