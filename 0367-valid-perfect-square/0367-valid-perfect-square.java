class Solution {
    public boolean isPerfectSquare(int num) {
        long s = 1, e = num;
        while(s <= e)
        {
            long mid = s + (e-s)/2;
            long val = mid * mid;
                
            if(val == num)
                return true;
            else if(val < num)
            {
                s =  mid + 1;
            }
            else
            {
                e = mid - 1;
            }
        }
        return false;
    }
}