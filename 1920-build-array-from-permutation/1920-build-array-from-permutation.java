class Solution {
    public int[] buildArray(int[] nums) {

        int n = nums.length;

        // first pass - this will give the original value
        for(int i = 0; i < n; i++)
        {
            nums[i] = nums[i] + (n * (nums[nums[i]] % n));
        }

        // second pass - this will give the new value
        for(int i = 0; i < n; i++)
        {
            nums[i] = nums[i]/n;
        }

        return nums;

     /*   
        BURTE FORCE APPROACH 
        int n = nums.length;
        int j = 0;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++)
        {
            ans[j] = nums[nums[i]];
            j++;
        }
        return ans;
     */
    }
}