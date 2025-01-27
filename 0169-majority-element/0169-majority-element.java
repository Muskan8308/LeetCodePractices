class Solution {
    public int majorityElement(int[] nums) {
       // 1st way
        int cnt = 1, ans = 0;
        int n = nums.length;

        Arrays.sort(nums);
        for(int i = 0; i < n-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                cnt++;
                if(cnt > n/2)
                    ans = nums[i];
            }
            else
                cnt = 1;
        }
        return n == 1 ? nums[0] : ans;
       
// 2nd way
    //    Arrays.sort(nums);
    //    int n = nums.length;
    //    return nums[n/2];

    }
}