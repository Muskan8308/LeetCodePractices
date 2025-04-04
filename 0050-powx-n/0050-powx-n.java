class Solution {
    public double myPow(double x, int n) {
        
        // making power positive
        long N = n;
        if(N < 0)
        {
            x = 1 / x;
            N = -N;
        }
        return power(x, N);
    }

    double power(double x, long N)
    {
        if(N == 0)
        return 1;

        double ans = power(x, N/2);
        if(N % 2 == 0)
        return ans * ans;
        else
        return ans * ans * x;
    }
}