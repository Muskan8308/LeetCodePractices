class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n-1; j++)
            {
                if(nums[j] == 0 && nums[j+1] != 0)
                {
                    int temp = nums[j];
                    nums[j] =nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}