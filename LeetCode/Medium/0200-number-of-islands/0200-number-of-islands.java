class Solution {

    class Pair {

        int i, j;
        Pair(int i, int j)
        {
            this.i = i;
            this.j = j;
        }
    }

    public int numIslands(char[][] grid) {

        int m = grid.length, n = grid[0].length;
        int noOfIsland = 0;

        boolean[][] vis = new boolean[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(grid[i][j] == '1' && (!vis[i][j]))
                {
                    bfs(grid, vis, i, j);
                    noOfIsland++;
                }
            }
        }
        return noOfIsland;
    }

    private void bfs(char[][] grid, boolean[][] vis, int i, int j)
    {
        Queue<Pair> q = new LinkedList<>();
        int m = grid.length, n = grid[0].length;

        q.add(new Pair(i, j));

        while(q.size() > 0)
        {
            Pair front = q.remove();
            int x = front.i, y = front.j;

            // top -> row-1, col
            if(x > 0)
            {
                if((!vis[x-1][y]) && grid[x-1][y] == '1')
                {
                    q.add(new Pair(x-1, y));
                    vis[x-1][y] = true;
                }
            }

            // bottom -> row+1, col
            if(x < m-1)
            {
                if((!vis[x+1][y]) && grid[x+1][y] == '1')
                {
                    q.add(new Pair(x+1, y));
                    vis[x+1][y] = true;
                }
            }

            // left -> row, col-1
            if(y > 0)
            {
                if((!vis[x][y-1]) && grid[x][y-1] == '1')
                {
                    q.add(new Pair(x, y-1));
                    vis[x][y-1] = true;
                }
            }

            // right -> row, col+1
            if(y < n-1)
            {
                if((!vis[x][y+1]) && grid[x][y+1] == '1')
                {
                    q.add(new Pair(x, y+1));
                    vis[x][y+1] = true;
                }
            }
        }

    }














}