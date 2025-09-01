class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        int[] memo = new int[n];     // n-1 to 0
        Arrays.fill(memo, -1);
        return Math.min(minCost(cost, n-1, memo), minCost(cost, n-2, memo));

    }

    private int minCost(int[] cost, int i, int[] memo)
    {

        if(i <= 1) return cost[i];
        if(memo[i] != -1) return memo[i];
        return memo[i] = cost[i] + Math.min(minCost(cost, i-1, memo), minCost(cost, i-2, memo));

    }
}