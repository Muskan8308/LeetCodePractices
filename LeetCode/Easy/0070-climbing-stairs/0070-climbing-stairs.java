class Solution {
    public int climbStairs(int n) {
        
        return climbs(n);
    }

    private int climbs(int n)
    {
        if(n <= 2) return n;
        return climbs(n-1) + climbs(n-2);
    }
}