class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        // Tabulation 
        int n = cost.length;
        // int[] dp = new int[3];
        int next1 = cost[n-1]; 
        int next2 = cost[n-2];

        for(int i = n-3; i >= 0; i--)
        {
            int curr = cost[i] + Math.min(next1, next2);
            next1 = next2;
            next2 = curr;
        }

        return Math.min(next1, next2);
    }
}