class Solution {
    public int minBitFlips(int start, int goal) {
       
        int xor = start ^ goal;
        int cnt = 0;        // Count the number of 1's in the binary representation of xor
        while(xor != 0)
        {
            cnt += xor & 1;      // Check if the last bit is 1
            xor >>= 1;           // Shift right to check the next bit
        }
        return cnt;
    }
}