class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        HashSet<String> set = new HashSet<>();
        int cnt = 0;
        for(int i = 0; i < words.length; i++)
        {
            if(set.contains(reverse(words[i])))
            cnt++;
            else
            set.add(words[i]);
        }
        return cnt;
    }

    private String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}