class Solution {
    public int mySqrt(int x) {
        
        long s = 0, e = x;
        long ans = -1;
        while(s <= e)
        {
            long mid = s + (e-s)/2;
            long val = mid * mid;
            if(x == val)
            return (int)mid;
            else if(val < x)
            {
                ans = mid;
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        return (int)ans;
    }
}