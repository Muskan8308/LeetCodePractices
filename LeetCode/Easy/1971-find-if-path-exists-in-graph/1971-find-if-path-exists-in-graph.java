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
        bfs(adj, vis, source, destination);
        return vis[destination];
    }

    private void bfs(List<List<Integer>> adj, boolean[] vis, int source, int des)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        while(q.size() > 0)
        {
            int front = q.remove();
            for(int ele : adj.get(front))
            {
                if(!vis[ele])
                {
                    q.add(ele);
                    vis[ele] = true;
                    if(ele == des) return;
                }
            }
        }
    }

}