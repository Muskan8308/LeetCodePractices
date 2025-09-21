class Solution {
    public int minDistance(String word1, String word2) {
        
        int m = word1.length(), n = word2.length();
        int num = LCS(word1, word2, m-1, n-1);

        return ((m - num) + (n - num));

    }

    public int LCS(String s, String r, int i, int j)
    {
        if(i < 0 || j < 0) return 0;

        if(s.charAt(i) == r.charAt(j)) return 1 + LCS(s, r, i-1, j-1);
        else return Math.max(LCS(s, r, i, j-1), LCS(s, r, i-1, j));
    }
}