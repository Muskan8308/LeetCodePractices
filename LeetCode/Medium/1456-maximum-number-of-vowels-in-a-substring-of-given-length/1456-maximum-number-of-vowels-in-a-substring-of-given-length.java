class Solution {
    public int maxVowels(String s, int k) {
        
        int cnt = 0, maxCnt = 0, n = s.length();

        for(int i = 0; i < k; i++)
        {
            char c = s.charAt(i);
            if(isVowel(c)) cnt++;
        }

        maxCnt = cnt;

        int i = 1, j = k;
        while(j < n)
        {
            char c = s.charAt(j), x = s.charAt(i-1);
            if(isVowel(c)) cnt++;
            if(isVowel(x)) cnt--;
            maxCnt = Math.max(maxCnt, cnt);
            j++;
            i++;
        }
        return maxCnt;
    }

    private boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}