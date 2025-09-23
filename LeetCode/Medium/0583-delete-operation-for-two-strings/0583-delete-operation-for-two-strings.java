class Solution {
    public int minDistance(String word1, String word2) {
        
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m][n];
        for(int[] arr : dp) Arrays.fill(arr, -1);

        int num = LCS(word1, word2, m-1, n-1, dp);

        return ((m - num) + (n - num));

    }

    public int LCS(String s, String r, int i, int j, int[][] dp)
    {
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == r.charAt(j)) return dp[i][j] = 1 + LCS(s, r, i-1, j-1, dp);
        else return dp[i][j] = Math.max(LCS(s, r, i, j-1, dp), LCS(s, r, i-1, j, dp));
    }
}