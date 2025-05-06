class Solution {
    public int[] buildArray(int[] nums) {
        
        int n = nums.length;
        int j = 0;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++)
        {
            ans[j] = nums[nums[i]];
            j++;
        }
        return ans;
    }
}