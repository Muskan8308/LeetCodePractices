class Solution {

    // public int singleNumber(int[] nums) {
        
    // }

    // public int singleNumber(int[] nums) {
        
    // }

    // Sorting Approach
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-1; i += 2)
        {
            if(nums[i] != nums[i+1])
            return nums[i];
        }
        return nums[nums.length-1];
    }

    // Brute Force approach  TC - O(n^2)  SC - O(1)
    // public int singleNumber(int[] nums) {

    //     int n = nums.length;
    //     for(int i = 0; i < n; i++)
    //     {
    //         boolean flag = false;
    //         for(int j = 0; j < n; j++)
    //         {
    //             if(i == j) continue;
    //             if(nums[i] == nums[j]) flag = true;
    //         }
    //         if(!flag) return nums[i];
    //     }
    //     return 0;
    // }
}