class Solution {
    public int compress(char[] chars) {
        String s = "" + chars[0];
        int cnt = 1;
        for(int i = 1; i < chars.length; i++)
        {
            int j = i-1;
            if(chars[i] == chars[j])
            {
                cnt++;
            }
            else        // a != b
            {
                if(cnt > 1) s += cnt;
                cnt = 1;
                s += chars[i];
            }
        }
        if(cnt > 1) s += cnt;
        for(int i = 0; i < s.length(); i++)
        {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}