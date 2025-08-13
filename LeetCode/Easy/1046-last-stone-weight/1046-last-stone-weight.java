class Solution {
    public int lastStoneWeight(int[] stones) {
        
        // maxheap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones)
        {
            pq.add(ele);
        }

        while(pq.size() > 1)
        {
            int y = pq.remove();
            int x = pq.remove();
            if(x != y)
            pq.add(y-x);
        }
        return pq.size() == 1 ? pq.peek() : 0 ;
    }
}