class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;
        for(int ele : nums)
        {
            xor ^= ele;
        }
        
        int rightBitOff = xor & (xor-1);    // this will off the right bit of the xor which will help in finding mask
        int mask = rightBitOff ^ xor;

        // creating two buckets to store the result of xor of each element
        int b1 = 0, b2 = 0;

        for(int ele : nums)
        {
            // mask is designed in the way that by doing xor with any element it will give either 0 or 1.
            if((ele & mask) == 0) b1 ^= ele;
            else b2 ^= ele;
        }   

        return new int[]{b1,b2};
    }
}