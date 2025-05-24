class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);

            if(map.containsKey(sch))
            {
                if(map.get(sch) != tch) return false;   // checks if curret charcter is mapped to two different characters
            }
            else if(map.containsValue(tch))     // if the 't' string's character already mapped to 's' string's character
            return false;
            else                // if not present, then simply insert in the map
            map.put(sch, tch);
        }
        return true;
    }
}