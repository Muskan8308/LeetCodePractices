class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;
        int finalJump = n-1;

        for(int i = n-2; i >= 0; i--)
        {
            if(nums[i] + i >= finalJump)
            finalJump = i; 
        }
        
        return finalJump == 0 ? true : false;
    }
}