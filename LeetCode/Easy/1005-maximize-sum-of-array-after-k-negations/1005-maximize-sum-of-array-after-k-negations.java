class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
        int i = 0;
        Arrays.sort(nums);
        while(i < nums.length && k > 0)
        {
            if(nums[i] < 0)
            {
                nums[i] *= -1;
                k--;
            }
            i++;
        }

        if(k % 2 == 1)  // if k is odd
        {
            Arrays.sort(nums);
            nums[0] *= -1;
        }

        int sum = 0;
        for(int s : nums)
        {
            sum += s;
        }

        return sum;
    }
}