class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        return pathSum(grid, 0, 0, m, n, sum);        
    }

    public int pathSum(int[][] grid, int i, int j, int m, int n, int sum) {
        
        if(i >= m || j >= n) return 0;
        if(i == m-1 && j == n-1) return sum += grid[i][j];
        int rightSum = pathSum(grid, i, j+1, m, n, sum);
        int bottomSum = pathSum(grid, i+1, j, m, n, sum);

        return sum += Math.max(rightSum, bottomSum);
    }
}