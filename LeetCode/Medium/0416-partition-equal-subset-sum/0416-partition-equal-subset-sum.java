class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int ele : nums) sum += ele;

        if(sum % 2 != 0) return false;

        int[][] dp = new int[nums.length][sum+1];
        for(int[] arr : dp)
        Arrays.fill(arr, -1);

        return partitions(nums, 0, sum % 2, dp);
    }

    public boolean partitions(int[] nums, int idx, int sum, int[][] dp)
    {
        if(idx == nums.length) return sum == 0;
        if(dp[idx][sum] != -1) return dp[idx][sum] == 1;

        boolean ans = false;
        boolean skip = partitions(nums, idx+1, sum, dp);
        if(sum - nums[idx] < 0) ans = skip;
        else 
        {
            boolean pick = partitions(nums, idx+1, sum - nums[idx], dp);
            ans = skip || pick;
        }

        dp[idx][sum] = ans ? 1 : 0;
        return ans;
    }
}