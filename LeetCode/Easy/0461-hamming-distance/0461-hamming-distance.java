class Solution {
    public int hammingDistance(int x, int y) {

        int xor = x ^ y;    // get the xor 

        // now just count the set bits
        int setBit = 0;

        while(xor != 0)
        {
            xor = xor & (xor-1);
            setBit++;
        }

        return setBit;      // this is the hamming distance or differnet numbers
    }
}