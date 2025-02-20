class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        // prefix array to store left product

        ans[0] = 1; // 1st left product will always be 1 
        for(int i = 1; i < n; i++)
        {
            ans[i] = ans[i-1] * nums[i-1];
        }

        // right product nikalo kro aur final answer update kro
        int suffix = 1; 
        for(int i = n-1; i >= 0; i--)
        {
            ans[i] *= suffix;       // left product * right product
            suffix *= nums[i];      // suffix ko update kro
        }
        return ans;
    }
}