class Solution {
    public int countHillValley(int[] nums) {
        
        int j = 0, cnt = 0;

        for(int i = 1; i < nums.length-1; i++)
        {
            if(nums[i] != nums[i+1])
            {
                if((nums[i] > nums[j] && nums[i] > nums[i+1]) 
                || (nums[i] < nums[j] && nums[i] < nums[i+1]))  // encountered a hill or valley
                cnt++;
                j = i;
            }  
        }
        return cnt;
    }
}