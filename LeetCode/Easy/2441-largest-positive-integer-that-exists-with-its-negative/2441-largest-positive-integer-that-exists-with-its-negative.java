class Solution {
    public int findMaxK(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int maxPos = -1;

        for(int num : nums)
        {
            if(set.contains(-num))
            maxPos = Math.max(maxPos, Math.abs(num));

            set.add(num);
        }
        
        return maxPos;
    }
}