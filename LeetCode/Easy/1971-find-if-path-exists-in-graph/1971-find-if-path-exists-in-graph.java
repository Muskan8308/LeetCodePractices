class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(source == destination) return true;

        // Create an adjacency list from the edges array
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++)
        adj.add(new ArrayList());

        for(int i = 0; i < edges.length; i++)
        {
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        
        boolean[] vis = new boolean[n];

        vis[source] = true;
        dfs(adj, vis, source);
        return vis[destination];
    }

    private void dfs(List<List<Integer>> adj, boolean[] vis, int source)
    {
        vis[source] = true;

        for(int ele : adj.get(source))
        {
            if(!vis[ele]) dfs(adj, vis, ele);
        }
    }



}