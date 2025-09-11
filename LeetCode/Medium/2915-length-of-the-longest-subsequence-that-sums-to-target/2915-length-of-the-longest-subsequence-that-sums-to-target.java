class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        
        // i -> 0 to n-1 | target/key -> target to 0
        int[][] dp = new int[nums.size()][target+1];
        for(int[] arr : dp)
        Arrays.fill(arr, -1);

        return maxLength(nums, target, 0, 0, dp);

    }

    public int maxLength(List<Integer> nums, int key, int i, int cnt, int[][] dp) {
        
        if(i == nums.size())
        {
            if(key == 0) return cnt;
            else return -1;
        }
        if(dp[i][key] != -1) return dp[i][key];

        int skip = maxLength(nums, key, i+1, cnt, dp);    // count laa ke dega
        if(key - nums.get(i) < 0) return dp[i][key] = skip;
        int take = maxLength(nums, key - nums.get(i), i+1, cnt+1, dp);

        return dp[i][key] = Math.max(skip, take); 
    }
}