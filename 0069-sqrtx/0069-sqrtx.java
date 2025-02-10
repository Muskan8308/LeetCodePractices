class Solution {
    public int mySqrt(int x) {
        
        int s = 0, e = x;
        int ans = -1;
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            int val = mid * mid;
            if(x == val)
            return mid;
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
        return ans;
    }
}