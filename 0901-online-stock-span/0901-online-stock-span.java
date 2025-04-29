class StockSpanner {

    Stack<Integer> st = new Stack<>();
    ArrayList<Integer> arr = new ArrayList<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        
        arr.add(price);
        int idx = arr.size() - 1;       // dynamic way of cal idx

        while(!st.isEmpty() && arr.get(st.peek()) <= price)
        st.pop();

        int span = st.isEmpty() ? idx + 1 : idx - st.peek();
        st.push(idx);
        
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */