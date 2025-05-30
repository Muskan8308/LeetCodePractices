class Solution {
    public String countAndSay(int n) {
        
        if(n == 1) return "1";

        StringBuilder str = new StringBuilder(countAndSay(n-1) + "A");
        StringBuilder ans = new StringBuilder("");

        // Modifying str
        int i = 0, j = 0;
        while(j < str.length())
        {
            if(str.charAt(i) == str.charAt(j))
            {
                j++;
            }
            else
            {
                int len = j - i;
                ans.append(len);
                ans.append(str.charAt(i));
                i = j;
            }
        }
        return ans.toString();
    }
}