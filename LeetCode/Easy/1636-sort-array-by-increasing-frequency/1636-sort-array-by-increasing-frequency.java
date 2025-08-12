class Solution {

    class Pair implements Comparable<Pair> {

        int ele, freq;
        Pair(int ele, int freq)
        {
            this.ele = ele;
            this.freq = freq;
        }

        public int compareTo(Pair p) 
        {
            if(this.freq == p.freq) return p.ele - this.ele;
            return this.freq - p.freq;
        }
    }

    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // counting freqency of each element
        for(int ele : nums)
        {
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele, 1);   
        }

        // adding all elements in minheap
        for(int ele : map.keySet())
        {
            pq.add(new Pair(ele, map.get(ele)));
        }

        int[] ans = new int[nums.length];

        int idx = 0;
        while(pq.size() > 0)
        {
            Pair p = pq.remove();
            while(p.freq > 0 && idx < nums.length)
            {
                ans[idx++] = p.ele;
                p.freq--;
            }
        }
        return ans;
    }
}