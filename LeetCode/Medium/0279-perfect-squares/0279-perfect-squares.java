class Solution {
    public int numSquares(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return minSquares(n, dp);
    }

    public int minSquares(int n, int[] dp) {
        
        if(isPerfect(n)) return 1;
        if(dp[n] != -1) return dp[n];

        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= n/2; i++)
        {
            int cnt = minSquares(i, dp) + minSquares(n-i, dp);
            min = Math.min(min, cnt);
        }
        return dp[n] = min;
    }


    private boolean isPerfect(int n)
    {
        int sqrt = (int)Math.sqrt(n);
        return sqrt * sqrt == n; 
    }
}