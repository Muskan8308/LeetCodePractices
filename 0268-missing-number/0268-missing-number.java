class Solution {
    public int missingNumber(int[] nums) {

        // 1st way
        int n = nums.length;
        // Arrays.sort(nums);

        // for(int i = 0; i < n; i++)
        // {
        //     if(nums[i] != i)
        //     return i;
        // }

        // return n;

/*
        // 2nd way
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
*/

    // 3rd way

        Arrays.sort(nums);
        if(nums[0] != 0) return 0;
        if(nums[n-1] != n) return n;

        for(int i =1; i < n; i++)
        {
            if(nums[i] != i)
            return i;
        }
        return 0;
    }
}