class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length(), n = text2.length();
        // StringBuilder s1 = new StringBuilder(text1);
        // StringBuilder s2 = new StringBuilder(text2);

        int[][] dp = new int[m+1][n+1];
        // for(int[] arr : dp) Arrays.fill(arr, -1);

        for(int i = m-1; i >= 0; i--)
        {
            for(int j = n-1; j >= 0; j--)
            {
                if(text1.charAt(i) == text2.charAt(j))          // last char is same
                dp[i][j] = 1 + dp[i+1][j+1];   
                else                                        // last char differs
                {
                    int ans1 = dp[i+1][j];
                    int ans2 = dp[i][j+1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[0][0];
    }

    public int subSeq(StringBuilder s1, StringBuilder s2, int i1, int i2, int[][] dp) 
    {
        if(i1 < 0 || i2 < 0) return 0;
        if(dp[i1][i2] != -1) return dp[i1][i2];

        if(s1.charAt(i1) == s2.charAt(i2))          // last char is same
        return dp[i1][i2] = 1 + subSeq(s1, s2, i1 - 1, i2 - 1, dp);   
        else                                        // last char differs
        {
            int ans1 = subSeq(s1, s2, i1 - 1, i2, dp);
            int ans2 = subSeq(s1, s2, i1, i2 - 1, dp);
            return dp[i1][i2] = Math.max(ans1, ans2);
        }

    }
}