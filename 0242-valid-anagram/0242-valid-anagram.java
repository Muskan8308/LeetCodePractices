class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
        return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map1.containsKey(ch))         // update the freq
            map1.put(ch, map1.get(ch) + 1);
            else                            // insert the new one
            map1.put(ch, 1);
        }

        for(int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(map2.containsKey(ch))         // update the freq
            map2.put(ch, map2.get(ch) + 1);
            else                            // insert the new one
            map2.put(ch, 1);
        }

        return map1.equals(map2);
    }
}