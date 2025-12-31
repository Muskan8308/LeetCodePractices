class Solution {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int[] colored = new int[n];         // visited array
        Arrays.fill(colored, -1);
        boolean[] isBipartite = {true};   

        for(int i = 0; i < n; i++)
        {
            if(colored[i] == -1)
            bfs(graph, isBipartite, colored, i);
        }
        
        return isBipartite[0];
    }

    private void bfs(int[][] graph, boolean[] isBipartite, int[] colored, int i)
    {
        colored[i] = 0;     // 0 - red, 1 - black

        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while(q.size() > 0)
        {
            int front = q.remove();
            int color = colored[front];

            for(int ele : graph[front])
            {
                if(colored[ele] == colored[front])      // both have the same color
                {
                    isBipartite[0] = false;
                    return;
                }

                if(colored[ele] == -1)
                {
                    colored[ele] = 1 - color;
                    q.add(ele);
                }

            }
        }

    }
}