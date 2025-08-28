class Solution {
    public int maxVowels(String s, int k) {
        
        int cnt = 0, maxCnt = 0, n = s.length();

        for(int i = 0; i < k; i++)
        {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            cnt++;
        }

        maxCnt = Math.max(maxCnt, cnt);
        char ch = s.charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') cnt--;
 
        int i = 1, j = k;
        while(j < n)
        {
            char c = s.charAt(j);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') cnt++;
            maxCnt = Math.max(maxCnt, cnt);
            j++;
            i++;
            char x = s.charAt(i-1);
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') cnt--;
        }
        return maxCnt;
    }
}