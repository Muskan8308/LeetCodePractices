class Solution {
    public int longestPalindromeSubseq(String s) {
        
        String r = reverse(s);
        int n = s.length();                // len(s) == len(r)
        return longestSeq(s, r, n-1, n-1);
    }

    public int longestSeq(String s, String r, int i, int j) 
    {
        
        if(i < 0 || j < 0) return 0;

        if(s.charAt(i) == r.charAt(j)) return 1 + longestSeq(s, r, i-1, j-1);
        else return Math.max(longestSeq(s, r, i, j-1), longestSeq(s, r, i-1, j));
    
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