class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        
        // i -> 0 to n-1 | target/key -> target to 0
        int[][] dp = new int[nums.size()][target+1];
        for(int[] arr : dp)
        Arrays.fill(arr, -1);

        int ans = maxLength(nums, target, 0, dp);
        return ans < 0 ? -1 : ans;
    }

    public int maxLength(List<Integer> nums, int key, int i, int[][] dp) {
        
        if(i == nums.size())
        {
            if(key == 0) return 0;          // A valid subsequence found
            else return Integer.MIN_VALUE;  // not found
        }
        if(dp[i][key] != -1) return dp[i][key];

        int skip = maxLength(nums, key, i+1, dp);            // count laa ke dega
        if(key - nums.get(i) < 0) return dp[i][key] = skip;
        int take = 1 + maxLength(nums, key - nums.get(i), i+1, dp);

        return dp[i][key] = Math.max(skip, take); 
    }
}