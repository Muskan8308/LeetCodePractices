class Solution {

    // For adjacency matrix,  TC - O(n^2) in worst case 
    // For adjacency list,    TC - O(V + 2E) in general case 
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        int cnt = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++)
        {
            if(!visited[i])
            {
                bfs(i, visited, isConnected);
                cnt++;
            }
        }
        return cnt;
    }

    private void bfs(int i, boolean[] vis, int[][] adj)
    {
        int n = adj.length;
        Queue<Integer> q = new LinkedList<>();
        vis[i] = true;
        q.add(i);

        while(q.size() > 0)
        {
            int front = q.remove();
            for(int j = 0; j < n; j++)
            {
                if(adj[front][j] == 1 && vis[j] == false)
                {
                    q.add(j);
                    vis[j] = true;
                } 
            }
        }

    }
}