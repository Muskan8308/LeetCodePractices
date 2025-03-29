class Solution {
    public double myPow(double x, int n) {
        
        long N = n;

        if(N < 0)   //  For negative n
        {
            x = 1 / x;
            N = -N;
        }
        return power(x, N);
    }

    double power(double x, long n)
    {
        if(n == 0)  return 1;
        double ans = power(x, n/2);
        if(n % 2 == 0)
        return ans * ans;
        else
        return ans * ans * x;
    }
}