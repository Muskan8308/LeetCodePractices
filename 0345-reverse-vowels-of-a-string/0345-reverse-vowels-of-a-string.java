class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Set.of('a','e','i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] ch = s.toCharArray();
        int i = 0, j = ch.length-1;
        while(i <= j)
        {
            if(vowels.contains(ch[i]) && vowels.contains(ch[j]))
            {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            else if (!vowels.contains(ch[i]))
            {
                i++;
            }
            else if (!vowels.contains(ch[j]))
            {
                j--;
            }
            else
            {
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}