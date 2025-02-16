class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 1, e = num;
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            int val = mid * mid;
                
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