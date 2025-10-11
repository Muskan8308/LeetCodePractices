class Solution {
    public String longestPalindrome(String s) {
        
        int n = s.length();
        StringBuilder maxStr = new StringBuilder("");
        int[][] dp = new int[n][n];

        for(int k = 0; k < n; k++)
        {
            int i = 0, j = k;
            while(j < n)
            {
                if(i == j)          // 1 len
                {
                    dp[i][j] = 1;
                    maxStr = new StringBuilder(s.substring(i, j+1));
                }
                else if(i+1 == j)   // 2 len
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        dp[i][j] = 1;
                        maxStr = new StringBuilder(s.substring(i, j+1));
                    }
                }
                else
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        if(dp[i+1][j-1] == 1)
                        {
                            dp[i][j] = 1;
                            maxStr = new StringBuilder(s.substring(i, j+1));
                        }
                    }
                }
                i++;
                j++;
            }
        }

        return maxStr.toString();
    }
}