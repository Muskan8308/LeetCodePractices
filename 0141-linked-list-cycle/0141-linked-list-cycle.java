/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        if(head == null || head.next == null)   return false;
        while(fast != null)
        {
            if(slow == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)        // cycle detected
            return true;
        }
        return false;
    }
}