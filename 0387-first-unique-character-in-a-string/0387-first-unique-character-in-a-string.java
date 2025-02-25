class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i)-'a']++;
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(freq[s.charAt(i)-'a'] == 1)
            return i;
        }
        return -1;
    /*    
        for(int i = 0; i < s.length(); i++)
        {   
            boolean flag = true;
            for(int j = 0; j < s.length(); j++)
            {
                if(i != j && s.charAt(i) == s.charAt(j))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            return i; 
        }
        
        return -1;
    */
    }
}