class Solution {
    public int lengthOfLIS(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];
        int max = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(nums[i] > nums[j])
                dp[i] = Math.max(dp[i], dp[j]);
            }
            dp[i] = 1 + dp[i];
            max = Math.max(dp[i], max);
        }
        
        return max;
    }
}