class Solution {

    // public int singleNumber(int[] nums) {
        
    // }

    // public int singleNumber(int[] nums) {
        
    // }

    // public int singleNumber(int[] nums) {
        
    // }

    // Brute Force approach
    public int singleNumber(int[] nums) {

        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            boolean flag = false;
            for(int j = 0; j < n; j++)
            {
                if(i == j) continue;
                if(nums[i] == nums[j]) flag = true;
            }
            if(!flag) return nums[i];
        }
        return 0;
    }
}