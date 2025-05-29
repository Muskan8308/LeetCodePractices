class Solution {

    List<String> ans;

    private void print(int open, int close, String s, int n)
    {
        if(s.length() == 2*n)
        {
            ans.add(s);
            return;
        }

        if(open < n) print(open+1, close, s+"(", n);
        if(close < open) print(open, close+1, s+")", n);
    }

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        print(0, 0, "", n);
        return ans;
    }
}