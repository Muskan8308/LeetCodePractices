class Solution {
    public boolean isPowerOfFour(int n) {

        if(n <= 0) return false;
        return ((n & n-1) == 0) && isPerfect(n);
    }

    public boolean isPerfect(int n) {

        int root = (int)Math.sqrt(n);
        return (root * root == n);
    }
}