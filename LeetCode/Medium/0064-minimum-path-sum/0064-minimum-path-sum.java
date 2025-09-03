class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        return pathSum(grid, 0, 0, m, n);        
    }

    public int pathSum(int[][] grid, int i, int j, int m, int n) {
        
        if(i >= m || j >= n) return Integer.MAX_VALUE;
        if(i == m-1 && j == n-1) return grid[i][j];
        int rightSum = pathSum(grid, i, j+1, m, n);
        int bottomSum = pathSum(grid, i+1, j, m, n);

        return grid[i][j] + Math.min(rightSum, bottomSum);
    }
}