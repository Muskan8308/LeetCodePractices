class Solution {

    // Brute Force Approach with TC - O(n^2) and SC - O(1)
    // public int singleNumber(int[] nums)
    // {

    // }

    // Brute Force Approach with TC - O(n^2) and SC - O(1)
    // public int singleNumber(int[] nums)
    // {

    // }

    // Sorting Approach with TC - O(nlogn) and SC - O(logn)
    public int singleNumber(int[] nums)
    {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i += 3)
        {
            if(nums[i] != nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
    }

    // Brute Force Approach with TC - O(n^2) and SC - O(1)
    // public int singleNumber(int[] nums) {

    //     int n = nums.length;

    //     int cnt = 1;
    //     for(int i = 0; i < n; i++)
    //     {
    //         for(int j = 0; j < n; j++)
    //         {
    //             if(i == j) continue;
    //             if(nums[i] == nums[j]) cnt++;
    //         }
    //         if(cnt == 1) return nums[i];
    //         cnt = 1;
    //     }
    //     return 1;
    // }
}