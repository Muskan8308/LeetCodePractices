class Solution {
    public int minDistance(String s, String t) {

        int m = s.length() , n = t.length();
        if(m == 0 || n == 0) return 0;

        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                
                int p = (i > 0 && j > 0) ? dp[i-1][j-1] : (i == 0 ? j : i);
                int q = (i > 0) ? dp[i-1][j] : j;
                int r = (j > 0) ? dp[i][j-1] : i;

                if(s.charAt(i) == t.charAt(j))
                dp[i][j] = p;
                else 
                {
                    int del = q;
                    int ins = r;
                    int rep = p;
                    dp[i][j] = 1 + Math.min(del, Math.min(ins, rep));
                }
            }
        }

        return dp[m-1][n-1];

    }

   
}