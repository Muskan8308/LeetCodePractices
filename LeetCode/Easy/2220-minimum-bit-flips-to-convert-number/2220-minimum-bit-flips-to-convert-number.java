class Solution {
    public int minBitFlips(int start, int goal) {

        int xor = start ^ goal;
        // now just count the set bits from the xor
        
        int set = 0;
        while(xor != 0)
        {
            xor = xor & (xor-1);
            set++;
        }
        return set;        // no. of different bits
    }
}