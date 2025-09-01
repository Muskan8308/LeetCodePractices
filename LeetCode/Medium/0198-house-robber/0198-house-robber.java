class Solution {

    // Recursion + Memoziation

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robAmount(nums, 0, dp);
    }

    public int robAmount(int[] nums, int i, int[] dp) {
        
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + robAmount(nums, i+2, dp);      // Including
        int skip = robAmount(nums, i+1, dp);                // Excluding

        return dp[i] = Math.max(take, skip);

    }
}