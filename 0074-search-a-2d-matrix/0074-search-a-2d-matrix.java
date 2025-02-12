class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int s = 0, e = m * n - 1;

        while(s <= e)
        {
            int mid =  s + (e-s)/2;
            int midEle = matrix[mid / n][mid % n];

            if(target == midEle)
                return true;
            else if(target < midEle)
                e = mid - 1;
            else 
                s = mid + 1;
        }
        return false;
    }
}