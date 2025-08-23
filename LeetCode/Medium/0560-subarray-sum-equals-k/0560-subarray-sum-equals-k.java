class Solution {
    public int subarraySum(int[] nums, int k) {
       
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;          // count of subarray
        for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i-1]; 

        // Traverse on the prefix array
        for(int i = 0; i < nums.length; i++)
        {
            int rem = nums[i] - k;  // sum of a subarray
            
            if(nums[i] == k) count++;
            if(map.containsKey(rem)) count += map.get(rem);
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i])+1);
            else  map.put(nums[i], 1);  
        }
        return count;
    }
}