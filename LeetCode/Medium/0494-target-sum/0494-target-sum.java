class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return expCnt(nums, target, 0);
    }

    public int expCnt(int[] nums, int key, int i) {

        if(i == nums.length) return key == 0 ? 1 : 0;
        int takePlus = expCnt(nums, key - nums[i], i+1);
        int takeMinus = expCnt(nums, key + nums[i], i+1);
        return takePlus + takeMinus;
    }
}