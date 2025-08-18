class Solution {

    public class Triplet implements Comparable<Triplet>{
        int ele, row, col;
        Triplet(int ele, int row, int col)
        {
            this.ele = ele;
            this.row = row;
            this.col = col;
        }

        public int compareTo(Triplet t)
        {
            return this.ele - t.ele;
        }
    }


    public int[] smallestRange(List<List<Integer>> nums) {
        
        int[] ans = {0, Integer.MAX_VALUE};
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int maxRange = Integer.MIN_VALUE;
        int k = nums.size();

        // Maintain a heap of size k
        for(int i = 0; i < k; i++)
        {
            int ele = nums.get(i).get(0);           // basically -> arr[i][0]
            pq.offer(new Triplet(ele, i, 0));
            maxRange = Math.max(maxRange, ele);
        }

        // Find the minimum range 
        while(true)
        {
            Triplet top = pq.poll();
            int ele = top.ele, i = top.row, j = top.col;

            // Update the minimum range 
            if(maxRange - ele < ans[1] - ans[0])
            {
                ans[0] = ele;
                ans[1] = maxRange;
            }

            if(j == nums.get(i).size() - 1)     // the last element of that list
            break;
            int next = nums.get(i).get(j+1);
            maxRange = Math.max(maxRange, next);
            pq.offer(new Triplet(next, i, j+1));
        }

        return ans;
    }
}