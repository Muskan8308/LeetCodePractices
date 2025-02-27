class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLen = 0;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            // Check if the current character is already in the StringBuilder
            int idx = str.indexOf(String.valueOf(currChar));
            if (idx != -1) {
                // If found, remove all characters before and including the duplicate
                str.delete(0, idx + 1);
            }

            // Append the current character
            str.append(currChar);

            // Update the maximum length
            maxLen = Math.max(maxLen, str.length());
        }

        return maxLen;
    }
}