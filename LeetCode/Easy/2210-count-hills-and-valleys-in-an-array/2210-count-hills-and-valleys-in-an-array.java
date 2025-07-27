class Solution {
    public int countHillValley(int[] nums) {
        
        int i = 1, cnt = 0;

        while(i < nums.length-1)
        {
            int j = i;
            if(nums[j] == nums[j-1] || nums[j] == nums[j+1])
            j++;
            
            if(nums[j] > nums[j-1] && nums[j] > nums[j+1])  // encountered a hill
            cnt++;

            if(nums[j] < nums[j-1] && nums[j] < nums[j+1])  // encountered a valley
            cnt++;

            i++;
        }
        return cnt;
    }
}