class MyLinkedList {

    public class Node {
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
    }

        Node head;
        int size;

    public MyLinkedList() {

        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node temp = head;
        for(int i = 0; i < index; i++)
        temp = temp.next;

        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp = head;
        Node t = new Node(val);
        if (head == null) { 
            head = t;
        }
        else
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = t;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;

        if (index == 0) { 
            addAtHead(val);
            return;
        }
        Node t = new Node(val);
        Node temp = head;

        for(int i = 0; i < index - 1; i++)
        temp = temp.next;

        t.next = temp.next;
        temp.next = t;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        if(head == null || head.next == null) return;

        if (index == 0) { 
            head = head.next;
        }
        else {
            Node temp = head;
            for(int i = 0; i < index - 1; i++)
            temp = temp.next;
            
            temp.next = temp.next.next;
        }
        
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */