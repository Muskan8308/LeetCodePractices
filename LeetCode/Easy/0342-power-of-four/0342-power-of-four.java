class Solution {
    public boolean isPowerOfFour(int n) {
        // Recursive approach
        /*
        if(n <= 0)  return false;
        if(n == 1)  return true;
        // if(n % 4 != 0)  return false;

        return (n % 4 == 0) && isPowerOfFour(n / 4);
        */

        // Iterative approach

        if(n <= 0) return false;

        while(n % 4 == 0)
        n /= 4;

        return n == 1;
    }
}