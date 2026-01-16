class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        // Step 1. Reverse the graph to get the indegree of all the nodes 
        // and the paths we got will eventually leads to the safe node

        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int[] indeg = new int[n];

        for(int i = 0; i < n; i++)
        adj.add(new ArrayList<>());

        for(int i = 0; i < n; i++)
        {
            for(int ele : graph[i])
            {
                // In original graph, edge goes from i to ele
                // But in reversed graph, edge goes from ele to i

                adj.get(ele).add(i);
                indeg[i]++;
            }
        }
        
        // Step 2. Apply Kahn's algo

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++)
        if(indeg[i] == 0) q.add(i);

        while(q.size() > 0)
        {
            int front  = q.remove();
            ans.add(front);
            for(int ele : adj.get(front))
            {
                indeg[ele]--;
                if(indeg[ele] == 0)
                q.add(ele);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}