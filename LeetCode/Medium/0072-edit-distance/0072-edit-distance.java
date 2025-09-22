class Solution {
    public int minDistance(String word1, String word2) {

        StringBuilder s = new StringBuilder(word1);
        StringBuilder t = new StringBuilder(word2);
        int m = s.length() , n = t.length();

        int[][] dp = new int[m][n];

        for(int[] a : dp)
        Arrays.fill(a, -1);

        return minSteps(s, t, m-1, n-1, dp);

    }

    public int minSteps(StringBuilder s, StringBuilder t, int i, int j, int[][] dp) {
        
        if(i == -1) return j+1;
        if(j == -1) return i+1;
        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == t.charAt(j))
        return dp[i][j] = minSteps(s, t, i-1, j-1, dp);
        else 
        {
            int del = minSteps(s, t, i-1, j, dp);
            int ins = minSteps(s, t, i, j-1, dp);
            int rep = minSteps(s, t, i-1, j-1, dp);
            return dp[i][j] = 1 + Math.min(del, Math.min(ins, rep));
        }
        
    }
}