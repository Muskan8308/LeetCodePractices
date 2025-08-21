class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        Arrays.sort(nums);
        int n = nums.length, m = queries.length;

        // make prefix array
        for(int i = 1; i < n; i++)
        nums[i] += nums[i-1];        

        // use binary search to find the longest subsequence

        int[] ans = new int[m];
        for(int i = 0; i < m; i++)
        {
            int s = 0, e = n-1;
            while(s <= e)
            {
                int mid  = s + (e-s)/2;
                if(nums[mid] > queries[i])
                    e = mid - 1;
                else
                {
                    ans[i] = Math.max(ans[i], mid+1);
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
}