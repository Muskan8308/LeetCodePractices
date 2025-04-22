/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null) return null;
        if(head != null && head.next == null) return head;
        int size = 0;
        ListNode temp = head;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        k = k % size;
        temp = head;
        for(int i = 0; i < size-k-1; i++)
        temp = temp.next;

        ListNode c = null, t = temp.next;
        c = t;
        temp.next = null;

        while(t != null && t.next != null)
        t = t.next;

        t.next = head;
        head = c;
        return head;
    }
}