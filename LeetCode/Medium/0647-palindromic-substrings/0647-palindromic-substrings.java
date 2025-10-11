class Solution {
    public int countSubstrings(String s) {
        
        int n = s.length(), cnt = 0;
        int[][] dp = new int[n][n];

        for(int k = 0; k < n; k++)      // How many times the loop will execute
        {
            int i = 0, j = k;
            while(j < n)                // Diagonal loop 
            {
                if(i == j)              // 1 length palindrome
                {
                    dp[i][j] = 1;
                    cnt++;
                }
                else if(i+1 == j)       // 2 length palindrome
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        dp[i][j] = 1;
                        cnt++;
                    }
                }
                else                    // 3 or more length palindrome
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        if(dp[i+1][j-1] == 1) 
                        {
                            dp[i][j] = 1;
                            cnt++;
                        }
                    }
                }
                i++;
                j++;
            }
        }
        return cnt;
    }
}