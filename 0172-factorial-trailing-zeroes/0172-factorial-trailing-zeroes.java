class Solution {
    public int trailingZeroes(int n) {
        
        // base case
        if(n < 5)  return 0;

        return n/5 + trailingZeroes(n/5);
    }
}