class Solution {
    public int minDistance(String word1, String word2) {

        StringBuilder s = new StringBuilder(word1);
        StringBuilder t = new StringBuilder(word2);

        int m = s.length() , n = t.length();
        return minSteps(s, t, m-1, n-1);

    }

    public int minSteps(StringBuilder s, StringBuilder t, int i, int j) {
        
        if(i == -1) return j+1;
        if(j == -1) return i+1;

        if(s.charAt(i) == t.charAt(j))
        return minSteps(s, t, i-1, j-1);
        else 
        {
            int del = minSteps(s, t, i-1, j);
            int ins = minSteps(s, t, i, j-1);
            int rep = minSteps(s, t, i-1, j-1);
            return 1 + Math.min(del, Math.min(ins, rep));
        }
        
    }
}