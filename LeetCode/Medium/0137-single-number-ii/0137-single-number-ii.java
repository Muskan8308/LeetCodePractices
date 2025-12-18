class Solution {
    public int singleNumber(int[] nums) {

        int n = nums.length;

        int cnt = 1;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == j) continue;
                if(nums[i] == nums[j]) cnt++;
            }
            if(cnt == 1) return nums[i];
            cnt = 1;
        }
        return 1;
    }
}