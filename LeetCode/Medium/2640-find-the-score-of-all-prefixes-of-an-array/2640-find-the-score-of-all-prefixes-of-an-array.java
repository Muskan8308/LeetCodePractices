class Solution {
    public long[] findPrefixScore(int[] nums) {
        
        int n = nums.length;
        long[] ans = new long[n];

        int max = nums[0];
        for(int i = 0; i < n; i++)
        {
            max = Math.max(max, nums[i]);
            ans[i] = (long)(nums[i] + max);
        }

        for(int i = 1; i < n; i++)
        {
            ans[i] += ans[i-1];
        }

        return ans;
    }
}