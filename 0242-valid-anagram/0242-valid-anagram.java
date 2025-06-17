class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
        return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))         // update the freq
            map.put(ch, map.get(ch) + 1);
            else                            // insert the new one
            map.put(ch, 1);
        }

        for(int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(!map.containsKey(ch))         
            return false;
           
            map.put(ch, map.get(ch) - 1);
        }

        // All values in map should be 0 for s & t to be anagram
        for(Integer i : map.values())
        {
            if(i != 0) return false;
        }

        return true;
    }
}