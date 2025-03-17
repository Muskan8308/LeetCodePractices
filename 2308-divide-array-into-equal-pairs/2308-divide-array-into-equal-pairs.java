class Solution {
    public boolean divideArray(int[] nums) {
        
        int[] freq = new int[501];

        // make freq array
        for(int i = 0; i < nums.length; i++)
        {
            freq[nums[i]]++;
        }

        // check for n pairs

        for(int i = 0; i < nums.length; i++)
        {
            if(freq[nums[i]] % 2 != 0)
            return false;
        }

        return true;
    }
}