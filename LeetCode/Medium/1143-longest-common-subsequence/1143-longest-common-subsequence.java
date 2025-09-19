class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m][n];
        for(int[] arr : dp) Arrays.fill(arr, -1);

        return subSeq(text1, text2, m-1, n-1, dp);
    }

    public int subSeq(String s1, String s2, int i1, int i2, int[][] dp) 
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