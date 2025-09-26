class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length(), n = text2.length();
        char[] s = text1.toCharArray();
        char[] t = text2.toCharArray();

        int[][] dp = new int[m+1][n+1];

        for(int i = m-1; i >= 0; i--)
        {
            for(int j = n-1; j >= 0; j--)
            {
                if(s[i] == t[j])                            // last char is same
                dp[i][j] = 1 + dp[i+1][j+1];   
                else                                        // last char differs
                dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);

            }
        }

        // We can also print the LCS which is also a question.
        StringBuilder str = new StringBuilder("");
        
        int i = m, j = n;
        while(i > 0 && j > 0)
        {
        	if(s[i-1] == t[j-1]) str.append(s[i-1]);
        	if(dp[i][j-1] > dp[i-1][j]) j--;
        	else i--;
        }
        
        System.out.println(str.reverse());


        return dp[0][0];
    }

    
}