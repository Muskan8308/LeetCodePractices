class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        return Math.max(robbery(nums, 0, n-2, dp1), robbery(nums, 1, n-1, dp2));
    }

    public int robbery(int[] nums, int i, int end, int[] dp) {

        if(i > end) return 0;
        if(dp[i] != -1) return dp[i];

        int take = nums[i] + robbery(nums, i+2, end, dp);
        int skip = robbery(nums, i+1, end, dp);
        
        return dp[i] = Math.max(take, skip);
    }
}