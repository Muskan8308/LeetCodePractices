class Solution {
    public int uniquePaths(int m, int n) {
        
        if(m == 1 || n == 1)    return 1;

        int rightWays = uniquePaths(m, n-1);
        int downWays = uniquePaths(m-1, n);

        return rightWays + downWays;
    }
}