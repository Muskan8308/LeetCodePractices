class Solution {
    public int longestPalindromeSubseq(String s) {
        
        String r = reverse(s);
        int n = s.length();                // len(s) == len(r)
        int[][] dp = new int[n][n];
        for(int[] arr : dp) Arrays.fill(arr, -1);

        return longestSeq(s, r, n-1, n-1, dp);
    }

    public int longestSeq(String s, String r, int i, int j, int[][] dp) 
    {
        
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == r.charAt(j)) return dp[i][j] = 1 + longestSeq(s, r, i-1, j-1, dp);
        else return dp[i][j] = Math.max(longestSeq(s, r, i, j-1, dp), longestSeq(s, r, i-1, j, dp));
    
    }

    public String reverse(String s)
    {
        StringBuilder r = new StringBuilder("");

        int i = s.length() - 1;
        while(i >= 0)
        {
            r.append(s.charAt(i--));
        }

        return r.toString();
    }
}