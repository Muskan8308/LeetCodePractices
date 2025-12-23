class Solution {
    public int reverseBits(int n) {

        int i = 0, j = 31;

        while(i < j)
        {
            // create mask for both ith and jth bit
            int Imask = (1 << i), Jmask = (1 << j);

            boolean Ion = ((n & Imask) != 0), Jon = ((n & Jmask) != 0);     // will check the ith and jth bit is on (set) or not

            if(Ion != Jon) 
            {
                n ^= Imask;     // This will flip the ith bit 
                n ^= Jmask;     // This will flip the jth bit 
            } 
            i++;
            j--;
        }
        return n;
    }
}