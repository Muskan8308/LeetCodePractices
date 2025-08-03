class Solution {

    class Pair implements Comparable<Pair> {
        int x, diff;
        Pair(int x, int diff)
        {
            this.x = x;
            this.diff = diff;
        }

        public int compareTo(Pair p)
        {
            if(this.diff == p.diff) return this.x - p.x;
            return this.diff - p.diff;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // MaxHeap
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> list = new ArrayList<>();

        for(int ele : arr)
        {
            int diff = Math.abs(ele - x);
            pq.add(new Pair(ele, diff));
            if(pq.size() > k) pq.remove();
        }

        while(pq.size() > 0)
        {
            Pair p = pq.remove();
            list.add(p.x);
        }
        Collections.sort(list);
        return list;
    }
}