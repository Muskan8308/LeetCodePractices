class Solution {
    int cnt = 0;

    private void isPalindrome(String s, int l, int r)
    {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
        {
            cnt++; l--; r++; 
        }
    }

    public int countSubstrings(String s) {
       
        for(int i = 0; i < s.length(); i++)
        {
            isPalindrome(s, i, i);
            isPalindrome(s, i, i+1);
        }
        return cnt;
    }
}