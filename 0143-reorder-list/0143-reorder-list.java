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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return; // base case
 
        ListNode t1 = head;
        // find left middle
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode t2 = slow.next;
        slow.next = null;

        // reverse the right part of list
        ListNode prev = null, curr = t2, after = null;
        while(curr != null)
        {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        t2 = prev;
        
        // reorder the list
        ListNode c1 = t1, c2 = t2;
        while (c2 != null)
        {
            ListNode next_c1 = c1.next;
            ListNode next_c2 = c2.next;
            
            c1.next = c2;
            if(next_c1 == null) break;
            c2.next = next_c1;
            
            c1 = next_c1;
            c2 = next_c2;
        }
    }
}