class Solution {

    public int fib(int n) {
        int[] dp = new int[n+1];
        return fibo(n, dp);
    }

    private int fibo(int n, int[] dp)
    {
        if(n <= 1) return n;

        if(dp[n] != 0) return dp[n];        // if val is already calculated then return the same, don't make further calls
        int ans = fibo(n-1) + fibo(n-2);
        dp[n] = ans;                // Before return, store that value/answer in the array
        return ans;
    }
}