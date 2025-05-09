class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        String s1 = remainingString(s);
        String s2 = remainingString(t);

        return s1.equals(s2);
    }

    private String remainingString(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(st.size() > 0 && c == '#')
            st.pop();
            else if(st.size() == 0 && c == '#')
            continue;
            else
            st.push(c);
        }

        StringBuilder str = new StringBuilder("");
        while(st.size() > 0)
        str.append(st.pop());

        str.reverse();
        return str.toString();
    }
}