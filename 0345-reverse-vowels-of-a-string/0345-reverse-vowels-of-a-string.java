class Solution {
    public String reverseVowels(String s) {

// More efficient (Boolean array) than hashSet
        char[] vowels = "aeiouAEIOU".toCharArray();
        boolean[] isVowel = new boolean[128];    // since ASCII values are 0 - 127
        for(char c : vowels)
        {
            isVowel[c] = true;
        }

        char[] ch = s.toCharArray();
        int left = 0, right = ch.length-1;
        while(left < right)
        {
            // left is not a vowel, move right
            while(left < right && !isVowel[ch[left]])   left++;

            // right is not a vowel, move left
            while(left < right && !isVowel[ch[right]])   right--;

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
            
        }

        return new String(ch);

/*
    // Efficient way by using HashSet
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
*/
    }
}