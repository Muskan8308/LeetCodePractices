class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);

            if(map.containsKey(sch))
            {
                if(map.get(sch) != tch) return false;
            }
            else if(map.containsValue(tch))
            return false;
            else
            map.put(sch, tch);
        }
        return true;
    }
}