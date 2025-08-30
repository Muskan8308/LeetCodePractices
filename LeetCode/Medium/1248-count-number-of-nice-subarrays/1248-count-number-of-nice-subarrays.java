class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int i = 0, j = 0, a = 0, b = 0, n = nums.length, k2 = 0, cnt = 0;

        while(i < n && nums[i] % 2 == 0) i++;
        while(j < n && k2 < k) if(nums[j++] % 2 != 0) k2++;
        if(k2 < k) return 0;
        j--;
        b = j + 1;
        while(b < n && nums[b] % 2 == 0) b++;
        b--;

        // sliding window of 4 variables
        while(b < n)
        {
            cnt += (i-a+1) * (b-j+1);   // cominations of subarrays
            a = i + 1;
            i++;
            while(i < n && nums[i] % 2 == 0) i++;
            j = b + 1;
            b = j + 1;
            while(b < n && nums[b] % 2 == 0) b++;
            b--;
        } 

        return cnt;
    }
}