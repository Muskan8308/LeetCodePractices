class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        // Arrays.sort(nums);

        // for(int i = 0; i < n; i++)
        // {
        //     if(nums[i] != i)
        //     return i;
        // }

        // return n;

        int sum1 = 0, sum2 = 0;

        // Sum of all value present in the array
        for(int num : nums)
        {
            sum1 += num;
        }

        // Sum of the range 
        for(int i = 1; i <= n; i++)
        {
            sum2 += i;
        }

        return sum2 - sum1;
    }
}