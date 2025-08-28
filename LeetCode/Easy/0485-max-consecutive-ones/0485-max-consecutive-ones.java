class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      
        int len = 0, maxLen = 0, n = nums.length;
        int i = 0, j = 0;
        while(j < n)
        {
            if(nums[j] == 1)
            {
                len = j-i+1;
                maxLen = Math.max(maxLen, len);
                j++; 
            }

            while(j < n && nums[j] == 0)
            {
                j++;
                i = j;
            }
           
        }

        return maxLen;
      
      /*  
        // Brute Force Approach
        int cnt = 0, maxCnt = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            }   
            else        // nums[i] == 0 i.e, the cnt variable needs to reset 
            cnt = 0;
        }
        return maxCnt;
       */ 
    }
}