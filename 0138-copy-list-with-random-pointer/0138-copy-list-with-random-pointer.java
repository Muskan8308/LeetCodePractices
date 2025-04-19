/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if (head == null) return null; 
        Node head2 = new Node(0);
        Node t1 = head2;
        Node t2 = head;

        // Step 1. Creating deep copy

        while(t1 != null)
        {
            Node t = new Node(t1.val);
            t2.next = t;
            t2 = t;
            t1 = t1.next;
        }

        head2 = head2.next;
        t2 = head2;
        t1 = head;

        // Step2. Make alternate connections
        Node temp = new Node(0);
        while(t1 != null && t2 != null)
        {
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;

            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        } 
        t2 = head2;
        t1 = head;

        // Step 3. Assign the random pointers

        while(t1 != null && t2 != null)
        {
            if(t1.random == null) t2.random = null;
            else t2.random = t1.random.next;

            t1 = t1.next;
            if(t1 != null) t2 = t1.next;
        } 
        t2 = head2;
        t1 = head;

        // Step 4. Separate the lists
        while(t1 != null && t2 != null)
        {
            t1.next = t2.next;
            t1 = t1.next;
            if(t1 == null) break;
            t2.next = t1.next;
            if(t2.next == null) break;
            t2 = t2.next;  
        }
        return head2;
    }
}