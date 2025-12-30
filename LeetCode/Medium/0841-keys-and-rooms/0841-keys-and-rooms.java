class Solution {

    // TC - O(V + E) or less than O(n^2)
    // SC - O(n)
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        dfs(0, rooms, visited);

        for(boolean ele : visited)
        {
            if(!ele) return false;
        }

        return true;
    }

    private void dfs(int start, List<List<Integer>> rooms, boolean[] vis)
    {
        vis[start] = true;

        for(int ele : rooms.get(start))
        {
            if(!vis[ele]) dfs(ele, rooms, vis);
        }
    }

    // private void bfs(int start, List<List<Integer>> rooms, boolean[] vis)
    // {
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(start);

    //     while(q.size() > 0)
    //     {
    //         int front = q.remove();

    //         for(int ele : rooms.get(front))
    //         {
    //             if(!vis[ele])
    //             {
    //                 vis[ele] = true;
    //                 q.add(ele);
    //             }
    //         }
    //     }

    // }

}