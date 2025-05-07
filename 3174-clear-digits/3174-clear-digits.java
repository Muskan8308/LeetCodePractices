class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(!st.isEmpty() && (ch  >= 48 && ch <= 57))
            st.pop();
            else
            st.push(ch);
        }

        StringBuilder str = new StringBuilder();

        while(st.size() != 0)
        str.append(st.pop());

        str.reverse();
        return str.toString();
    }
}