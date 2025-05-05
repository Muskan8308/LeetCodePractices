class Solution {
    public String makeGood(String s) {
        
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(!st.isEmpty() && (ch == st.peek() + 32 || ch + 32 == st.peek()))
            {
                st.pop();
                continue;
            }
            st.push(ch);
        }

        StringBuilder str = new StringBuilder("");
        while(!st.isEmpty())
        {
            str.append(st.pop());
        }

        str.reverse();
        return str.toString();
    }
}