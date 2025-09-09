class Solution {
    public int findDuplicate(int[] nums) {
        int s = 1, e = nums.length-1;

        while(s < e)
        {
            int cnt = 0;
            int mid = s + (e-s)/2;
            // Count elements ≤ mid
            for(int num : nums)
            {
                if(num <= mid)
                cnt++;
            }

            if(cnt > mid)   // duplicate at left
            e = mid;
            else            // duplicate at right
            s = mid + 1;    
        }
        return s;
    }
}