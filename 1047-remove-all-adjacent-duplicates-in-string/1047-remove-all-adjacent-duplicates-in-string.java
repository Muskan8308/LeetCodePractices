class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>();

        for(int i = s.length() - 1; i >= 0; i--)
        {
            char ch = s.charAt(i);
            if(st.size() > 0 && ch == st.peek())
            st.pop();
            else
            st.push(ch);
        }

        StringBuilder str = new StringBuilder("");
        while(st.size() > 0)
        str.append(st.pop());

        return str.toString();
    }
}