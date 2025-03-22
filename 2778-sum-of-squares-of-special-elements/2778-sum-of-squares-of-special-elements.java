class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(sqrPossible(i + 1, n))
            {
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
    // check for the division of n and i i.e for special array.
    private boolean sqrPossible(int idx, int n)
    {
        if(n % idx == 0)
        return true;

        return false;
    }
}