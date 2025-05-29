class Solution {
    public int findGCD(int[] nums) {
        

        // 1. Recursive approach - using euclid's algorithm
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length-1]);
        

     /*
        // 2. Iterative Approach
        int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            maxi = Math.max(maxi, nums[i]);
            mini = Math.min(mini, nums[i]);
        } 

        // using long division method
        while(maxi % mini != 0)
        {
            int ans = maxi % mini;
            maxi = mini;
            mini = ans;
        }
        return mini;
     */
    } 

    private int gcd(int a, int b)
    {
        if (b == 0)
        return a;

        return gcd(b, a % b);
    }
}