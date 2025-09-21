class Solution {
    public int minInsertions(String s) {
        
        int n = s.length();
        String r = rev(s);

        int[][] dp = new int[n][n];
        for(int[] arr : dp) Arrays.fill(arr, -1);

        return (n - minSteps(s, r, n-1, n-1, dp));

    }

    public int minSteps(String s, String r, int i, int j, int[][] dp)
    {
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == r.charAt(j)) return dp[i][j] = 1 + minSteps(s, r, i-1, j-1, dp);
        else return dp[i][j] = Math.max(minSteps(s, r, i, j-1, dp), minSteps(s, r, i-1, j, dp));
    }

    public String rev(String s)
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