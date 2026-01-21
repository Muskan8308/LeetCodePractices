class Solution {

    static boolean ans; 
    public boolean canFinish(int n, int[][] pre) {

        ans = true;
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];

        // convert the given array into adjacency list

        for(int i = 0; i < n; i++)
        adj.add(new ArrayList<>());

        for(int i = 0; i < pre.length; i++)
        {
            int a = pre[i][0], b = pre[i][1];
            adj.get(b).add(a);
            // indeg[a]++;
        }
        
        for(int i = 0; i < n; i++)
        {
           if(!vis[i]) dfs(adj, vis, path, i);
        }
         
        return ans;
    }

    private void dfs(List<List<Integer>> adj, boolean[] vis, boolean[] path, int i)
    {
        vis[i] = true;
        path[i] = true;

        for(int ele : adj.get(i))
        {
            if(path[ele])
            {
                ans = false;
                return;
            }
            dfs(adj, vis, path, ele);
        }
        path[i] = false;        // backtrack
    }
}