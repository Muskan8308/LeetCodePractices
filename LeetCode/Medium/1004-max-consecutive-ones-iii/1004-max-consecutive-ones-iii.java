class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length, cntZeroes = 0, maxOnes = 0;
        int  i = 0, j = 0;

        // Sliding window
        while(j < n)
        {
            if(nums[j] == 0) cntZeroes++;

            // If more than k zeroes are fliped then shrink the window
            while(cntZeroes > k) 
            {
                if(nums[i] == 0) cntZeroes--;
                i++;
            } 

            // current window length
            maxOnes = Math.max(maxOnes , j - i + 1);    // 1's max length
            j++;
        }

        return maxOnes;
    }
}