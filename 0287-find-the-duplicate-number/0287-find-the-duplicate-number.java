class Solution {
    public int findDuplicate(int[] nums) {

       //  Floyd’s Cycle Detection Approach 
        int slow = nums[0];
        int fast = nums[0];

        // Detect cycle
        do 
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // find duplicate
        slow = nums[0];
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

        /*
        // Binary Search

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
        */
    }
}