class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int cnt = 0, prod = 1;
        if (k == 0) return 0;
        
        // variable sized windows
        for (int i = 0, j = 0; j < nums.length; j++) 
        {
            prod *= nums[j];                // increasing the product by adding the j_th element
            while (i <= j && prod >= k)     
            prod /= nums[i++];              // reducing the product by eleminating the i_th element

            cnt += j - i + 1;
        }
        return cnt;
    }
}