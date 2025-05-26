class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        for(int num : nums) set.add(num);

        for(int num : set)
        {
            if(!set.contains(num-1))        // num is starting point of the seq
            {
                int currNum = num;
                int currStreak = 1;         // length of current consecutive seq
                while(set.contains(currNum + 1))
                {
                    currStreak++;
                    currNum++;
                }
                maxLen = Math.max(maxLen, currStreak);
            }
        }
        return maxLen;
    }
}