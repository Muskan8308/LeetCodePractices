class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int prefSum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);      // for valid calculations, for (prefSum - k) == 0 this subarray should also get counted

        for(int i = 0; i < nums.length; i++)
        {
            prefSum += nums[i];
            if(map.containsKey(prefSum - k))
            {
                count += map.get(prefSum-k);
            }
            map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);
        }
        return count;
    }
}