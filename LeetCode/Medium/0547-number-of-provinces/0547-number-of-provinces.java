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
                dfs(i, visited, isConnected);
                cnt++;
            }
        }
        return cnt;
    }

    private void dfs(int i, boolean[] vis, int[][] adj)
    {
        // No need for the halt condition as it will automatically return back when it will reach the alredy visited element
        
        int n = adj.length;
        vis[i] = true;

        for(int j = 0; j < n; j++)
        {
            if(adj[i][j] == 1 && vis[j] == false)
            {
                dfs(j, vis, adj);
            } 
        }
    }
}