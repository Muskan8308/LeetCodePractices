class Solution {
    public char findTheDifference(String s, String t) {
        
        char res = 0;

        for(int c : s.toCharArray())
        {
            res ^= c;
        }

        for(int c : t.toCharArray())
        {
            res ^= c;
        }

        return res;
    }
}