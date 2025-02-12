class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m - 1;

        while (i < n && j >= 0)
        {
            if(matrix[i][j] == target)  
                return true;
            if (target < matrix[i][j]) 
                j--;            // move left
            else 
               i++;            // move down
        }
        return false;
    }
}