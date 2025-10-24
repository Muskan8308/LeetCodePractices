class Solution {

    public int minimumMountainRemovals(int[] nums) {

        int n = nums.length;
        int[] dpIn = new int[n], dpDe = new int[n];

        // longest increasing subseq, looping from l to r (0 - n)
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(nums[i] > nums[j])
                dpIn[i] = Math.max(dpIn[i], dpIn[j]);
            }
            dpIn[i] += 1;
        } 
        
        // longest increasing subseq, looping from r to l (n - 0)
        for(int i = n-1; i >= 0; i--)
        {
            for(int j = i+1; j < n; j++)
            {
                if(nums[i] > nums[j])
                dpDe[i] = Math.max(dpDe[i], dpDe[j]);
            }
            dpDe[i] += 1;
        } 

        // adding dpIn[i] & dpDe[i] to make mountain array
        int max = 0;

        for(int i = 0; i < n; i++)
        {
            if(dpIn[i] > 1 && dpDe[i] > 1)
            max = Math.max(max, dpIn[i] + dpDe[i] - 1);      // -1 is neccessary to reduce the ith value becoz it get calculated twice 
        }

        return n - max;
    }
}