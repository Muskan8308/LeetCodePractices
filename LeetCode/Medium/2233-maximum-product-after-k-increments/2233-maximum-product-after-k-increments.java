class Solution {
    public int maximumProduct(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums)
        {
            pq.add(num);
        }

        while(k > 0)
        {
            pq.add(pq.remove() + 1);
            k--;
        }

        int prod = 1;
        
        while(pq.size() > 0)
        {
            prod = (int)((long)prod * pq.remove() % 1000000007);
        }
        return prod;
    }
}