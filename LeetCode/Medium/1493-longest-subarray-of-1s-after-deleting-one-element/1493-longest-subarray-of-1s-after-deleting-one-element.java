class Solution {
    public int longestSubarray(int[] nums) {
        
        int left = 0, maxOnes = 0, zeroes = 0;
        int n = nums.length;

        for(int right = 0; right < n; right++)
        {
            if(nums[right] == 0)
            zeroes++;

            while(zeroes > 1)
            {
                if(nums[left] == 0) zeroes--;
                left++;
            }

            maxOnes = Math.max(maxOnes, right - left - zeroes + 1);
        }

        return maxOnes == n ? maxOnes - 1 : maxOnes;
    }
}