class Solution {
     
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return maxSum(arr, k, 0, dp);
    }

    public int maxSum(int[] arr, int k, int i, int[] dp) {

        // base case
        if(i == arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        
        int max = Integer.MIN_VALUE, ans = 0;

        for(int j = i; j < Math.min(i+k, arr.length); j++)
        {
            max = Math.max(max, arr[j]);
            int len = j - i + 1;    
            int sum = max * len + maxSum(arr, k, j+1, dp);
            ans = Math.max(ans, sum);
        }

        return dp[i] = ans;
    }
}