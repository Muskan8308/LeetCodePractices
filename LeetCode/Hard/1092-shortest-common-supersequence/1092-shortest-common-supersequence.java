class Solution {

    /*
        Approach will be like -
        1. Find the LCS of the given strings.
        2. Then, add the remaining characters of the strings at the appropriate place.

        # If you can find the length of the shortest common superseq then the 70% of the question is solved ^_~
        ↳ Length of SCS = len(s1) + len(s2) - len(lcs)       ← Quite Easy 
    */

    public String shortestCommonSupersequence(String str1, String str2) {

        String lcs = LCS(str1, str2);       // we'll get the lcs, here !!
        StringBuilder scs = new StringBuilder("");
        char[] s = str1.toCharArray(), t = str2.toCharArray(), l = lcs.toCharArray();       // Converting strings into arrays just for the sake of convenience !!
        int m = s.length, n = t.length, p = r.length;
        int i = 0, j = 0, k = 0;

        while(i < m && j < n && k < p)
        {
            while(s[i] != l[k])         // for string 1
            {
                scs.append(s[i++]);
            }

            while(t[j] != l[k])         // for string 2
            {
                scs.append(t[j++]);
            }
            scs.append(l[k++]);         // for common character i.e lcs 
            i++; j++;
        }

        // If any character remains of either str1 or str2 then we'll add them manually

        while(t[j] != l[k])         // for string 2
            {
                scs.append(t[j++]);
            }
            
        
    }

    public String LCS(String str1, String str2) {
        
        char[] s = str1.toCharArray(), t = str2.toCharArray();
        int m = s.length, n = t.length;

        int[][] dp = new int[m+1][n+1];

        // filling the dp table and finding the lcs
        for(int i = 1; i <= m; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(s[i-1] == t[j-1]) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        // storing (printing) the lcs

        StringBuilder lcs = new StringBuilder("");
        int i = m, j = n;
        while(i > 0 && j > 0)
        {
            if(s[i-1] == t[j-1]) 
            {
                lcs.append(s[i-1]);
                i--; j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]) i--;
            else j--;
        }
        
        lcs.reverse();
        return lcs.toString();
        // return lcs.reverse().toString();
    } 
}