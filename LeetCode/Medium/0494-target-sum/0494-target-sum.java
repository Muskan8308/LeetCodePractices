class Solution {

    static int sum;

    public int findTargetSumWays(int[] nums, int target) {
        
        sum  = 0;
        for(int ele : nums) sum += ele;

        int[][] dp = new int[nums.length][2*sum+1];
        for(int[] arr : dp)
        Arrays.fill(arr, -1);

        return expCnt(nums, target, 0, 0, dp);
    }

    public int expCnt(int[] nums, int key,int res, int i, int[][] dp) {

        if(i == nums.length) return res == key ? 1 : 0;
        if(dp[i][res+sum] != -1) return dp[i][res+sum];
        int takePlus = expCnt(nums, key, res - nums[i], i+1, dp);
        int takeMinus = expCnt(nums, key, res + nums[i], i+1, dp);
        return dp[i][res+sum] = takePlus + takeMinus;
    }
}