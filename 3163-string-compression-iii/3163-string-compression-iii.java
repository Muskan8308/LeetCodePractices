class Solution {
    public String compressedString(String word) {
        if(word == null || word.length() == 0) return "";

        StringBuilder comp = new StringBuilder();
        int cnt = 1;
        for(int i = 1; i < word.length(); i++)
        {
            if(word.charAt(i) == word.charAt(i-1))
            {
                cnt++;
                if(cnt == 9)
                {
                    comp.append(cnt).append(word.charAt(i-1));
                    cnt = 0;
                }
            }
            else
            {
                if(cnt > 0)
                comp.append(cnt).append(word.charAt(i-1));
                
                cnt = 1;
            }
        }
        if(cnt > 0)
        comp.append(cnt).append(word.charAt(word.length() - 1));
        
        return comp.toString();
    }
}