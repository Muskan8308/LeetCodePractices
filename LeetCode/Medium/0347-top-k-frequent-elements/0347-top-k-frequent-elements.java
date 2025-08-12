class Solution {

    class Pair implements Comparable<Pair> {
        int x, freq;
        Pair(int x, int freq)
        {
            this.x = x;
            this.freq = freq;
        }

        public int compareTo(Pair p)
        {
            return this.freq - p.freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        
        // minheap
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();    // ele , freq

        for(int ele : nums)
        {
            if(map.containsKey(ele)) map.put(ele, map.get(ele) + 1);
            else map.put(ele, 1);
        }

        for(int ele: map.keySet())
        {
            pq.add(new Pair(ele, map.get(ele)));
            if(pq.size() > k) pq.remove();
        }

        int[] ans = new int[k];
        int i = 0;
        while(pq.size() > 0)
        {
            Pair p = pq.remove();
            ans[i++] = p.x; 
        }

        return ans;
    }
}