class Solution {
    public int findGCD(int[] nums) {

        // Recursive approach - using euclid's algorithm

        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length-1]);

        /* 
        // Iterative APproach
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

    private int gcd(int m, int n)
    {
        if (n == 0)
        return m;

        return gcd(n, m % n);
    }
}