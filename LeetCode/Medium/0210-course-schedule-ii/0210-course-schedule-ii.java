class Solution {
    public int[] findOrder(int n, int[][] pre) {

       
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        int[] indeg = new int[n];

        // convert the given array into adjacency list

        for(int i = 0; i < n; i++)
        adj.add(new ArrayList<>());

        for(int i = 0; i < pre.length; i++)
        {
            int a = pre[i][0], b = pre[i][1];
            adj.get(b).add(a);
            indeg[a]++;
        }
        
        // implementing Kahn's algorithm
        Queue<Integer> q = new LinkedList<>();

        // find the node which has 0 as indegree
        for(int i = 0; i < n; i++)
        {
            if(indeg[i] == 0)
            q.add(i);
        }

        while(q.size() > 0)
        {
            int front = q.remove();
            ans.add(front);
            for(int ele : adj.get(front))
            {
                indeg[ele]--;
                if(indeg[ele] == 0)
                {
                    q.add(ele);
                }
            }
        }

        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
        res[i] = ans.get(i);
        return res;
    }
}