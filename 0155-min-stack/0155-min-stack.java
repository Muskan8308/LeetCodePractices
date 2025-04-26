class MinStack {
    
    Node head;
    int size;

    public MinStack() {
        head = null;
        size = 0;
    }
    
    public void push(int val) {
        Node t = new Node(val);
        t.next = head;
        head = t;
        size++;
    }
    
    public void pop() {
        if(head == null)
        {
            System.out.println("Stack is already empty!");
            return;
        }

        head = head.next;
        size--;
    }
    
    public int top() {
        if(head == null)
        {
            System.out.println("Stack is empty!");
            return -1;
        }
        return head.val;
    }
    
    public int getMin() {
        Node temp = head;
        int min = Integer.MAX_VALUE;
        
        while(temp != null)
        {
            min = Math.min(temp.val, min);
            temp = temp.next;
        }
        return min;
    }
}

class Node {
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */