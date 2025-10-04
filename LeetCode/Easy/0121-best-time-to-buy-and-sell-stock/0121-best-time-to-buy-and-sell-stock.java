class Solution {
    public int maxProfit(int[] prices) {


        // OPTIMAL SOLUTION

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices)
        {
            minPrice = Math.min(minPrice, price);
            
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;

    /*    
        // This is TABULATION T.C = O(n) and SC = O(n), Top-down DP giving TLE T.C = O(n^2) in worst case and SC = O(n).
        
        // This is just an another approach to solve this question. However, it is not an efficient solution for this question to give in an interview.
        // Also, this solution is inspired by the optimal solution or we can say that we can optimize this solution by reducing its SC upto O(1) by using only 2 variables  instead of an dp array.


        int n = prices.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        int minPrice = prices[0];

        for(int i = 1; i < n; i++)
        {
            minPrice = Math.min(minPrice, prices[i]);
            dp[i] = Math.max(dp[i-1], prices[i] - minPrice);
        }

        return dp[n-1];
     */
    
    }

    
}