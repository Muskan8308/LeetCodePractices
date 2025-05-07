class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(!st.isEmpty() && (st.peek() >= 97 && st.peek() <= 122) && (ch  >= 48 && ch <= 57))
            {
                st.pop();
                continue;
            }
            st.push(ch);
        }

        StringBuilder str = new StringBuilder();

        while(st.size() != 0)
        str.append(st.pop());

        str.reverse();
        return str.toString();
    }
}